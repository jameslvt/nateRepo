package com.natabm.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import sun.misc.BASE64Encoder;

public class PasswdUtils {
	
	/**
	 * md5加密
	 * @param msg 要加密的信息
	 * @return	加密后的信息
	 */
	public static String getMd5(String msg){
		try {
			MessageDigest md = MessageDigest.getInstance("md5");
			/*
			 * 算法处理
			 */
			if(msg!=null){
				byte[] b = md.digest(msg.getBytes());
				//利用Base64编码
				BASE64Encoder base = new BASE64Encoder();
				return base.encode(b);
			}
			return null;
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
	
	
	public static void main(String[] args){
		System.out.println(getMd5("666666"));
		
		
	}

}
