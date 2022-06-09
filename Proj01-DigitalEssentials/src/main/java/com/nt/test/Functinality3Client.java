package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.WishMessageGenerator;

public class Functinality3Client {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationcontext.xml");
		WishMessageGenerator bean = ctx.getBean("wmg", WishMessageGenerator.class);
		String wishMessage = bean.getWishMessage();
		System.out.println("Output: " + wishMessage);
		ctx.close();
	}

}
