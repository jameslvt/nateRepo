package com.natabm.utils;

public class SeqUtils {
	
	public static String machineId= new String("1");
	
	/**
	 *能够满足1S内应对1000*1000个流水号 
	 * @return
	 */
	public static String getSeq(){
		return machineId+  (System.currentTimeMillis()+"").substring(1)+ (System.nanoTime()+"").substring(7,10);
	}
	
	public static void main(String[] args) {
		System.out.println(getSeq());
	}

}
