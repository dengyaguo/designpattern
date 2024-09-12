package com.reflection;

import cn.hutool.core.io.FileUtil;
import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class ReflectionDemo {

    public static void main(String[] args) {
        List<String> strings = FileUtil.readLines("E:\\call_20210422.txt", "utf-8");
        ArrayList<CallRecordBackDTO> callRecordBackDTOS = new ArrayList<>();
        for (String string : strings) {
            string = string.replaceAll("\\\\", "");
            string = string.substring(1, string.length() - 1);
            JSONObject jsonObject = null;
            try {
                jsonObject = JSONObject.parseObject(string);
            } catch (Exception e) {
                e.printStackTrace();
            }
            String sn = jsonObject.getString("sn");
            String startTime = jsonObject.getString("startTime");
            CallRecordBackDTO callRecordBackDTO = new CallRecordBackDTO();
            callRecordBackDTO.setSn(sn);
            callRecordBackDTO.setStartTime(startTime);
            callRecordBackDTOS.add(callRecordBackDTO);
        }
        //FileUtil.writeLines(collect, "E:\\sn+startTime.txt", "utf-8");
        ArrayList<Object> dataList = new ArrayList<>();
        for (CallRecordBackDTO recordBackDTOS : callRecordBackDTOS) {
            String sn = recordBackDTOS.getSn();
            String startTime = recordBackDTOS.getStartTime();
            String deleteSQL = "DELETE FROM CALL_RECORD WHERE SN = '"+sn+"'" + "  "+ "and start_time = To_Date('" +startTime+ "', 'yyyy-mm-dd hh24:mi:ss')";
            dataList.add(deleteSQL);
        }
        FileUtil.writeLines(dataList, "E:\\deleteSQL_SN_TIME.txt", "utf-8");
    }
}
