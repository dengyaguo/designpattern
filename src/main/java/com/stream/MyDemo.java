package com.stream;

import com.alibaba.fastjson.JSON;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 *
 */
public class MyDemo {


        public static void main(String[] args) {
            BigDecimal length = new BigDecimal(9.99);
            BigDecimal wide = new BigDecimal(10);
            BigDecimal high = new BigDecimal(10);
            System.out.println(length.multiply(wide).multiply(high));
            System.out.println(new BigDecimal(8000));
            System.out.println(length.multiply(wide).multiply(high).divide(new BigDecimal(8000), 2, RoundingMode.UP));



//        ArrayList<WaybillDto> waybillDtos = new ArrayList<>();
//        waybillDtos.add(new WaybillDto("way123456",""));
//        waybillDtos.add(new WaybillDto("way123456",null));
//        waybillDtos.add(new WaybillDto("","pack123456"));
//        waybillDtos.add(new WaybillDto(null,"pack123456"));
//        waybillDtos.add(new WaybillDto("way123456","pack123456"));
//        waybillDtos.add(new WaybillDto("123456","654321"));
//
//        ArrayList<WaybillDto> collect = waybillDtos.stream().filter(dto -> !(StringUtils.isNotBlank(dto.getPackageNumber()) && StringUtils.isNotBlank(dto.getWaybillId())))
//                .collect(Collectors.collectingAndThen(Collectors.toCollection(() -> new TreeSet<>(
//                                Comparator.comparing(o ->
//                                        //兼容""和null
//                                        (StringUtils.isNotBlank(o.getWaybillId()) ? o.getWaybillId() : StringUtils.EMPTY) + "-" + (StringUtils.isNotBlank(o.getPackageNumber()) ? o.getPackageNumber() : StringUtils.EMPTY)))),
//                        ArrayList::new));
//
//        System.out.println(JSON.toJSONString(collect));
        System.out.println(""+""+"");
        System.out.println(StringUtils.isNotBlank(""+""+""));
    }
}
