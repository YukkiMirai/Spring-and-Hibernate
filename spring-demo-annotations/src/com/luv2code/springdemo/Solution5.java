package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Solution5 implements FortuneService {
	@Value("${hello.foo}")
	private String str1;
	@Value("${kiss.foo}")
	private String str2;
	@Value("${love.foo}")
	private String str3;
	
	
	
	
	@Override
	public String getFortune() {
		Random rd = new Random();
		String[] data= {str1,str2,str3};
 		int index = rd.nextInt(data.length);
		return data[index];
	}
	

}
