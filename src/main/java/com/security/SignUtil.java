package com.security;

import org.apache.commons.lang3.StringUtils;

import java.util.*;

/**
 * 该文件代码千万不要泄露，里面涉及密钥
 * 
 * @author yanglijun
 */
public class SignUtil {
	
	/**
     * 按key进行正序排列，之间以&相连
     * 
     * @param params
     * @return
     */
    public static String getSortParams(Map<String, Object> params, String secretKey) {
        SortedMap<String, Object> map = new TreeMap<String, Object>(params);
        Set<String> keySet = map.keySet();
        Iterator<String> iter = keySet.iterator();
        String str = "";
        while (iter.hasNext()) {
            String key = iter.next();
            String value = (String)map.get(key);
            str += key + "=" + value + "&";
        }
        if(str.length()>0){
            str = str.substring(0, str.length()-1);
        }
        if (StringUtils.isNotEmpty(secretKey)) {
        	str = str+"&secretKey="+secretKey;
        }
        return str;
    }
	
	/**
	 * 请求参数签名验证
	 * 
	 * @param paramMap
	 * @param sign
	 * @return
	 */
	public static boolean signValidator(String sign, String serverSign) {
        return StringUtils.equals(sign, serverSign);
    }
	
	/**
	 * 动态签章请求参数时间戳验证
	 * 
	 * @param timestamp
	 * @return
	 */
	public static boolean timestampValidator(String timestamp) {
		//验证时间（客户端调用时间）
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(Long.parseLong(timestamp));
		Date clientTime = calendar.getTime();
		
		//验证时间（服务器端时间）,允许前后3分钟误差
		Calendar start_calendar = Calendar.getInstance();
		start_calendar.add(Calendar.MINUTE, -3);
		Date start_Time = start_calendar.getTime();
		
		Calendar end_calendar = Calendar.getInstance();
		end_calendar.add(Calendar.MINUTE, 3);
		Date end_Time = end_calendar.getTime();

        //时间戳过期
        return !clientTime.before(start_Time) && !clientTime.after(end_Time);
    }
}