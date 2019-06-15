package com.trusdata.test;

import java.util.UUID;

import com.trusdata.common.util.MD5;

/**
 * 
 * @author JBDING
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("tuopin123 " + MD5.MD5Encode("tuopin123"));
		System.out.println("input     " + MD5.MD5Encode("input"));
		
		System.out.println("UUID      " + UUID.randomUUID().toString());
		System.out.println("UUID      " + UUID.randomUUID().toString().length());
	}
}
