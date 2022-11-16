package com.springlec.base.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springlec.base.service.calcservice;
import com.springlec.base.service.multiplication;

@Configuration
public class DataAccessConfig {
	@Bean
	public calcservice calcService() {
		
		return new calcservice() {
			
			@Override
			public int addAction(int num1, int num2) throws Exception {
				// TODO Auto-generated method stub
				return num1+num2;
			}
		};
	}
	
	@Bean
	public multiplication multService() {
		return new multiplication() {
			
			@Override
			public int multservice(int num1, int num2) throws Exception {
				// TODO Auto-generated method stub
				return num1*num2;
			}
		};
	}
}
