package com.stream;

import com.alibaba.fastjson.JSON;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 *
 */
public class MyDemo {
    public static void main(String[] args) {
        ArrayList<WaybillDto> waybillDtos = new ArrayList<>();
        waybillDtos.add(new WaybillDto("way123456",""));
        waybillDtos.add(new WaybillDto("way123456",null));
        waybillDtos.add(new WaybillDto("","pack123456"));
        waybillDtos.add(new WaybillDto(null,"pack123456"));
        waybillDtos.add(new WaybillDto("way123456","pack123456"));
        waybillDtos.add(new WaybillDto("123456","654321"));

        ArrayList<WaybillDto> collect = waybillDtos.stream().filter(dto -> !(StringUtils.isNotBlank(dto.getPackageNumber()) && StringUtils.isNotBlank(dto.getWaybillId())))
                .collect(Collectors.collectingAndThen(Collectors.toCollection(() -> new TreeSet<>(
                                Comparator.comparing(o ->
                                        //兼容""和null
                                        (StringUtils.isNotBlank(o.getWaybillId()) ? o.getWaybillId() : StringUtils.EMPTY) + "-" + (StringUtils.isNotBlank(o.getPackageNumber()) ? o.getPackageNumber() : StringUtils.EMPTY)))),
                        ArrayList::new));

        System.out.println(JSON.toJSONString(collect));
    }
}
