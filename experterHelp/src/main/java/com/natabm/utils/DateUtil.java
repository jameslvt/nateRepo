package com.natabm.utils;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 日期工具类
* @date: 2016-9-5 
* @author: sunliang 
* @title: DateUtil 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public final class DateUtil {
	
	/**
	 * 时间格式：yyyy-MM-dd HH:mm:ss
	 */
    public static final String TIME_FROMAT_SIMPLE1 = new String("yyyy-MM-dd HH:mm:ss");
	/**
	 * 时间格式：yyyy/MM/dd HH:mm:ss
	 */
    public static final String TIME_FROMAT_SIMPLE2 = new String("yyyy/MM/dd HH:mm:ss");
	/**
	 * 时间格式：yyyyMMddHHmmss
	 */
    public static final String TIME_FROMAT_SIMPLE3 = new String("yyyyMMddHHmmss");
	/**
	 * 时间格式：yyyy年MM月dd日 HH点mm分ss秒
	 */
    public static final String TIME_FROMAT_SIMPLE4 = new String("yyyy年MM月dd日 HH点mm分ss秒");
    /**
	 * 时间格式：yyyyMMdd HHmmss
	 */
    public static final String TIME_FROMAT_SIMPLE5 = new String("yyyyMMdd HHmmss");
    /**
     * 时间格式：HH:mm:ss
     */
    public static final String TIME_FROMAT_HHMMSS = new String("HH:mm:ss");
	/**
	 * 日期格式：yyyyMMdd
	 */
    public static final String DATE_FROMAT_YYYYMMDD1 = new String("yyyyMMdd");
	/**
	 * 日期格式：yyyy-MM-dd
	 */
    public static final String DATE_FROMAT_YYYYMMDD2 = new String("yyyy-MM-dd");
	
    /**
     * 字符串类型转时间类型
    * @date: 2016-9-5 
    * @author: sunliang 
    * @title: StringToDate 
    * @param dateStr
    * @param formatStr
    * @return 
    * @exception: 
    * @version: 1.0 
    * @description: 
    * update_version: update_date: update_author: update_note:
     */
    public static final Date StringToDate(String dateStr,String formatStr){
		SimpleDateFormat sf = new SimpleDateFormat(formatStr);
		Date date = null;
		try {
			date = sf.parse(dateStr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return date;
	}
	
    /**
     * 时间类型转字符串类型
    * @date: 2016-9-5 
    * @author: sunliang 
    * @title: DateToString 
    * @param date
    * @param formatStr
    * @return 
    * @exception: 
    * @version: 1.0 
    * @description: 
    * update_version: update_date: update_author: update_note:
     */
    public static final String DateToString(Date date,String formatStr){
		SimpleDateFormat sf = new SimpleDateFormat(formatStr);
		return sf.format(date);
	}
	
    /**
     * 增加天数
    * @date: 2016-9-5 
    * @author: sunliang 
    * @title: addDays 
    * @param date
    * @param addDays
    * @return 
    * @exception: 
    * @version: 1.0 
    * @description: 
    * update_version: update_date: update_author: update_note:
     */
    public static final Date addDays(Date date,int addDays){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DAY_OF_MONTH, addDays);
		return calendar.getTime();
	}
    
    /**
     * 增加分钟
    * @date: 2016-11-7 
    * @author: sunliang 
    * @title: addMinutes 
    * @param date
    * @param addMinutes
    * @return 
    * @exception: 
    * @version: 1.0 
    * @description: 
    * update_version: update_date: update_author: update_note:
     */
    public static final Date addMinutes(Date date,int addMinutes){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.MINUTE, addMinutes);
		return calendar.getTime();
    }
    
	/** 
	 * 校验时间是否为最近几小时以内
	* @date: 2016-11-29 
	* @author: songxj
	* @title: checkLatestOneHour 
	* @param queryDate
	* @param hours
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
    public static final boolean checkLatestHours(String queryDate, int hours){
		Date queryDateTime = DateUtil.StringToDate(queryDate, DateUtil.TIME_FROMAT_SIMPLE1);
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(queryDateTime);
		calendar.add(Calendar.HOUR, hours);
		Date queryDateOneHourLater = calendar.getTime();
		Date nowDate = new Date();
		if (queryDateTime.before(nowDate) && nowDate.before(queryDateOneHourLater)) {
			return true;
		}
		return false;
	}
    
    /**
     * 获取当月的第几天，从1开始
    * @date: 2016-11-9 
    * @author: zhangjj_crmpd
    * @title: getDayOfMonth 
    * @return 
    * @exception: 
    * @version: 1.0 
    * @description: 
    * update_version: update_date: update_author: update_note:
     */
    public static final Integer getDayOfMonth(){
    	Calendar now = Calendar.getInstance();
    	return now.get(now.DAY_OF_MONTH);
    }
    
    /**
     * 获取星期几,一周的第一天为周一
    * @date: 2016-11-9 
    * @author: zhangjj_crmpd
    * @title: getDayOfWeek 
    * @return 
    * @exception: 
    * @version: 1.0 
    * @description: 
    * update_version: update_date: update_author: update_note:
     */
    public static final Integer getDayOfWeek(){
    	Calendar now = Calendar.getInstance();
    	//一周第一天是否为星期天
    	boolean isFirstSunday = (now.getFirstDayOfWeek() == Calendar.SUNDAY);
    	//获取周几
    	int weekDay = now.get(Calendar.DAY_OF_WEEK);
    	//若一周第一天为星期天，则-1
    	if(isFirstSunday){
    		weekDay = weekDay - 1;
    		if(weekDay == 0){
    			weekDay = 7;
    		}
    	}
    	return weekDay;
    }
    
    /**
     * 
    * @date: 2017年3月3日 
    * @author: shangjun
    * @title: getYearByDate 
    * @param date
    * @return 
    * @exception: 
    * @version: 1.0 
    * @description: 
    * update_version: update_date: update_author: update_note:
     */
    public static String getYearByDate(Date date){
    	Calendar now = Calendar.getInstance();
    	now.setTime(date);
    	String year = String.valueOf(now.get(Calendar.YEAR));
    	return year;
    }
    
    /**
     * 判断当前时间是否在某个时间段内容
    * @date: 2016-11-16 
    * @author: yangwl
    * @title: judgeCurrentInTimePeriod 
    * @param beforTime
    * @param afterTime
    * @param format YYYY-MM-DD 或者  HH:mi:ss
    * @return 
    * @exception: 
    * @version: 1.0 
    * @description: 
    * update_version: update_date: update_author: update_note:
     */
    public static final boolean isCurrentInTimePeriod(String beforTime, String afterTime, String format){
    	boolean flag = false;
    	String nowDay = DateUtil.DateToString(new Date(), DATE_FROMAT_YYYYMMDD2);
    	if(TIME_FROMAT_HHMMSS.equals(format)){
			String nowTimeString = DateUtil.DateToString(new Date(), TIME_FROMAT_SIMPLE1);
			Date nowTime = DateUtil.StringToDate(nowTimeString, TIME_FROMAT_SIMPLE1);
			Date startTime = DateUtil.StringToDate(nowDay + " "+ beforTime, TIME_FROMAT_SIMPLE1);
			Date endTime = DateUtil.StringToDate(nowDay + " " + afterTime, TIME_FROMAT_SIMPLE1);
			if (startTime.before(nowTime) && endTime.after(nowTime)) {
				flag = true;
			}
    	}
    	if(DATE_FROMAT_YYYYMMDD2.equals(format)){
    		Date nowDate = DateUtil.StringToDate(nowDay, DATE_FROMAT_YYYYMMDD2);
    		Date startDate = DateUtil.StringToDate(beforTime, DATE_FROMAT_YYYYMMDD2);
    		Date endDate = DateUtil.StringToDate(afterTime, DATE_FROMAT_YYYYMMDD2);
    		if (startDate.before(nowDate) && endDate.after(nowDate)) {
    			flag = true;
    		}
    	}
		return flag;
    }
	
    /** 校验当前时间是否在起始时间内
	* @date: 2016-12-9 
	* @author: wangpei
	* @title: isEffective 
	* @param startTime
	* @param endTime
	* @param fromat
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public static final boolean isEffective(String startTime,String endTime,String fromat){
		if (CommonUtils.objectIsNull(startTime) || CommonUtils.objectIsNull(endTime) || CommonUtils.objectIsNull(fromat)) {
			return false;
		}
		String nowDay = DateUtil.DateToString(new Date(), fromat);
		Date nowDate = DateUtil.StringToDate(nowDay, fromat);
		Date startDate = DateUtil.StringToDate(startTime, fromat);
		Date endDate = DateUtil.StringToDate(endTime, fromat);
		if (nowDate.before(startDate) || nowDate.after(endDate)) {
			return false;
		}
		return true;
	}

	/**
     * 日期格式转换
    * @date: 2016-9-5 
    * @author: sunliang 
    * @title: stringToString 
    * @param dateStr
    * @param fromFormat
    * @param toFormat
    * @return 
    * @exception: 
    * @version: 1.0 
    * @description: 
    * update_version: update_date: update_author: update_note:
     */
    public static final String stringToString(String dateStr,String fromFormat,String toFormat){
		Date d = StringToDate(dateStr,fromFormat);
		String str = DateToString(d,toFormat);
		return str;
	}
    
    /**
     * 日期字符串转换成数据库中的Date(兼容oracle、mysql)
    * @date: 2016-9-28 
    * @author: zhangjj_crmpd
    * @title: stringToTimestamp 
    * @param dateStr
    * @param formatStr
    * @return
    * @throws ParseException 
    * @exception: 
    * @version: 1.0 
    * @description: 
    * update_version: update_date: update_author: update_note:
     */
    public static final Timestamp string2Timestamp(String dateStr,String formatStr) throws ParseException {
    	if(CommonUtils.objectIsNull(dateStr)){
    		return  null;
    	}
    		SimpleDateFormat sf = new SimpleDateFormat(formatStr);
        	return new Timestamp(sf.parse(dateStr).getTime());
    }
    
    /**
     * 将数据库时间格式转换为字符串(兼容oracle、mysql)
    * @date: 2016-10-10 
    * @author: zhangjj_crmpd
    * @title: timestamp2String 
    * @param timestap
    * @param formatStr
    * @return 
    * @exception: 
    * @version: 1.0 
    * @description: 
    * update_version: update_date: update_author: update_note:
     */
    public static final String timestamp2String(Timestamp timestap,String formatStr){
    	if(CommonUtils.objectIsNull(timestap)){
    		return  null;
    	}
    	SimpleDateFormat sf = new SimpleDateFormat(formatStr);
        return sf.format(timestap);
    }
	
}
