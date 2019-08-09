package com.ashish.spring.batch.step;

import org.springframework.batch.item.ItemProcessor;

import com.ashish.spring.batch.config.Registration;

public class BatchItemProcessor implements ItemProcessor<Registration, Registration> {

 	@Override
	public Registration process(Registration data) throws Exception {
		System.out.println("PROCESS");
		return data;
	}

}

