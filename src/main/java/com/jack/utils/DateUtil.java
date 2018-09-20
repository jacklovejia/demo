package com.jack.utils;


import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	
	 public static final String TIME_SHORT_FORMAT = "yyyyMMddHHmmss";
    /**
     * 获取日期，形如 YYYYMMDD
     *
     * @return 返回整数型日期
     */
    public static int getDay() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        String s = simpleDateFormat.format(new Date());

        return Integer.parseInt(s);
    }
    /**
     * 获取当前时间字符串(YYYYMMDDHHIISS)
     *
     * @return 当前时间字符串
     */
    public static String getCurrentTimeStr() {
        return new SimpleDateFormat(TIME_SHORT_FORMAT).format(new Date());
    }
    
    /**
     * @author Jack
     * @date 2018年4月9日 下午3:31:33 
     * @Description: 返回 yyyy/MM/dd 格式日期
     * @return
     */
    public static String getFormatDate(){
    	return new SimpleDateFormat("yyyy/MM/dd").format(new Date());
    }
    
    /**
     * @author Jack
     * @date 2018年4月9日 下午6:01:35 
     * @Description:返回 yyyy/MM/dd HH:mm:ss 格式日期
     * @return
     */
    public static String getFormatDate2(){
    	return new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date());
    }
    
    
}
