package com.natabm.utils;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 通用工具类
 * 
 * @date: 2016-10-5
 * @author: zhangjj_crmpd
 * @title: CommonUtils
 * @version: 1.0
 * @description： update_version: update_date: update_author: update_note:
 */
public class CommonUtils {
	
	/**
	 * 
	* @date: 2017年3月1日 
	* @author: fengjq
	* @title: addFee 
	* @param param
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public static String addFee(String fee1,String fee2){
		DecimalFormat format = new DecimalFormat("#0.00");
		double outFee = Double.parseDouble(fee1)+Double.parseDouble(fee2);
		return  format.format(outFee);
	}

	/**
	 * 驼峰转换成带有下划线的命名
	* @date: 2016-11-25 
	* @author: yangwl
	* @title: camelToUnderline 
	* @param param
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public static String camelToUnderline(String param){
	    if (param==null||"".equals(param.trim())){
	        return "";
	    }
	    int len=param.length();
	    StringBuilder sb=new StringBuilder(len);
	    for (int i = 0; i < len; i++) {
	        char c=param.charAt(i);
	        if (Character.isUpperCase(c)){
	            sb.append("_");
	            sb.append(Character.toLowerCase(c));
	        }else{
	            sb.append(c);
	        }
	    }
	    return sb.toString().toUpperCase();
	}
	
	/**
	 * 校验一个字符串是由数字组成
	* @date: 2017年4月12日 
	* @author: shangjun
	* @title: checkStringIsNumStr 
	* @param string
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public static boolean checkStringIsNumStr(String string){
		boolean returnFlag = false;
		if(string.matches("\\d+")){
			returnFlag = true;
		}
		return returnFlag;
	}
	
	/**
	 * 转换标签表达式为JS表达式
	 * 
	 * @date: 2016-11-14
	 * @author: yangwl
	 * @title: convertLabelExprToJsExpr
	 * @return
	 * @exception:
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public static String convertLabelExprToJsExpr(String labelExpr) {
		labelExpr = labelExpr.replaceAll("!=", "!@");
		labelExpr = labelExpr.replaceAll(">=", "!#");
		labelExpr = labelExpr.replaceAll("<=", "@@");
		labelExpr = labelExpr.replaceAll("=", "==");
		labelExpr = labelExpr.replaceAll(" and ", " && ");
		labelExpr = labelExpr.replaceAll(" or ", " || ");
		labelExpr = labelExpr.replaceAll("@@", "<=");
		labelExpr = labelExpr.replaceAll("!#", ">=");
		labelExpr = labelExpr.replaceAll("!@", "!=");
		return labelExpr;
	}

	/**
	 * 去掉末尾的0
	* @date: 2017-2-10 
	* @author: tianyf
	* @title: delZero 
	* @param src
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public static String delZero(String src) {
		if (src.endsWith("0"))
			return delZero(src.substring(0, src.length() - 1));
		else
			return src;
	}
	
	/**
	 * 计算两个字符串相除
	* @date: 2017年3月20日 
	* @author: shangjun
	* @title: divisionFee 
	* @param fee1
	* @param fee2
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public static String divisionFee(String fee1,String fee2){
		DecimalFormat format = new DecimalFormat("#0.00");
		double outFee = 0D;
		if(Double.parseDouble(fee2) != 0D){
			outFee = Double.parseDouble(fee1)/Double.parseDouble(fee2);
		}
		return  format.format(outFee);
	}
	
	/**
	 * double类型保留2位小数，四舍五入，返回string类型
	* @date: 2017年2月23日 
	* @author: fengjq
	* @title: double2String 
	* @param in
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public static String doubleRound(double in){
		String out = "0";
		DecimalFormat format = new DecimalFormat("#0.00");
		if(!objectIsNull(in)){
			out = format.format(in);
		}
		
		return out;
	}

	/**
	 * 将List用指定的分割符转化成字符串
	* @date: 2016-11-24 
	* @author: zhangjj_crmpd
	* @title: listToString 
	* @param list
	* @param separator
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public static String listToString(List<String> list, String separator) {
		if(objectIsNull(list)){
			return "";
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < list.size(); i++) {
			sb.append(list.get(i)).append(separator);
		}
		return sb.toString().substring(0, sb.toString().length() - 1);
	}

	/**
	 * 将Map中Value为null的值替换成空
	 * 
	 * @date: 2016-10-25
	 * @author: zhangjj_crmpd
	 * @title: mapValueIsNullRep
	 * @param map
	 * @exception:
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public static void mapValueIsNullRep(Map<String, Object> map) {
		if (objectIsNull(map)) {
			return;
		}
		for (Map.Entry<String, Object> me : map.entrySet()) {
			Object value = me.getValue();
			if (value == null || value.equals("null")) {
				map.put(me.getKey(), "");
			}
		}
	}
	
	/**
	 * 将Map中Value为null的值替换成空
	* @date: 2016-12-8 
	* @author: sunliang 
	* @title: mapValueIsNullRepByStr 
	* @param map 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public static void mapValueIsNullRepByStr(Map<String, String> map) {
		if (objectIsNull(map)) {
			return;
		}
		for (Map.Entry<String, String> me : map.entrySet()) {
			Object value = me.getValue();
			if (value == null || value.equals("null")) {
				map.put(me.getKey(), "");
			}
		}
	}

	/**
	 * 两个数相乘
	* @date: 2017年3月17日 
	* @author: shangjun
	* @title: multiplyFee 
	* @param fee1
	* @param fee2
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public static String  multiplyFee(String fee1,String fee2){
		DecimalFormat format = new DecimalFormat("#0.00");
		double outFee = Double.parseDouble(fee1)*Double.parseDouble(fee2);
		return  format.format(outFee);
	}
	
	/**
	 * 判断对象是否为空(支持String、list、map 判断是否为空字符串、size等于零)
	 * 
	 * @date: 2016-10-5
	 * @author: zhangjj_crmpd
	 * @title: objectIsNull
	 * @param object
	 * @return 如果为空 返回 true 有值 返回 false
	 * @exception:
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public static boolean objectIsNull(Object object) {

		/*
		 * 判断对象是否为空
		 */
		if (object == null) {
			return true;
		}

		/*
		 * 判断对象是否 List类型 如果是判断size大小
		 */
		if (object instanceof List) {
			if (((List) object).size() <= 0) {
				return true;
			}
		}

		/*
		 * 判断对象是否 Map类型 如果是判断size大小
		 */
		if (object instanceof Map) {
			if (((Map) object).size() <= 0) {
				return true;
			}
		}
		
		/*
		 * 判断对象是否 Set类型 如果是判断size大小
		 */
		if (object instanceof Set) {
			if (((Set) object).size() <= 0) {
				return true;
			}
		}

		/*
		 * 判断对象是否String 类型
		 */
		if (object instanceof String) {
			return ((String) object).isEmpty();
		}
		
		if (object instanceof String[]){
			if(((String[]) object).length <= 0) {
				return true;
			}
		}

		return false;
	}

	/**
	 * 空对象替换成空字符串
	 * 
	 * @date: 2016-11-2
	 * @author: wangpei
	 * @title: replaceNull
	 * @param in
	 * @return
	 * @exception:
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public static Object replaceNull(Object in) {
		if (in == null) {
			return "";
		}
		return in;
	}
	
	/**
	 * 
	* @date: 2017年3月1日 
	* @author: fengjq
	* @title: String2String 
	* @param in
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public static String StringRound(String in){
		String out = "";
		DecimalFormat format = new DecimalFormat("#0.00");
		if(!objectIsNull(in)){
			double din = Double.parseDouble(in);
			out = format.format(din);
		}
		
		return out;
	}
	
	/**
	 * 实现数字型字符串之间的减法
	* @date: 2017年3月13日 
	* @author: fengjq
	* @title: subFee 
	* @param fee1
	* @param fee2
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public static String subFee(String fee1,String fee2){
		DecimalFormat format = new DecimalFormat("#0.00");
		double outFee = Double.parseDouble(fee1)- Double.parseDouble(fee2);
		return  format.format(outFee);
	}

	/**
	 * 转换成驼峰命名
	 * 
	 * @date: 2016-11-14
	 * @author: wangpei
	 * @title: toCmelModel
	 * @param name
	 * @return
	 * @exception:
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public static String toCamelModel(String name) {
		name = name.toLowerCase();
		String[] temp = name.split("_");
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < temp.length; i += 1) {
			if (temp[i].length() <= 0)
				continue;
			if (i != 0) {
				sb.append(temp[i].substring(0, 1).toUpperCase());
			} else {
				sb.append(temp[i].substring(0, 1));
			}
			sb.append(temp[i].substring(1));
		}
		return sb.toString();
	}
	
	/**
	 * 返回该对象的toString方法，如果对象为空 返回""
	* @date: 2016-12-8 
	* @author: zhangjj_crmpd
	* @title: toString 
	* @param obj
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public static String toString(Object obj){
		return obj==null?"":obj.toString();
	}
	
	/**
	 * 判断是否为空，为空返回“0”
	* @date: 2017-3-30 
	* @author: wangth
	* @title: isNullString 
	* @param string
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public static String isNullString(String string){
		String returnStr = "0";
		if(string != null && !"".equals(string) && !"NULL".equals(string) && !"null".equals(string)){
			returnStr = string;
		}
		return returnStr;
	}
}
