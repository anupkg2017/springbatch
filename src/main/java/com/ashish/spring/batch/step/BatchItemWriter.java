package com.ashish.spring.batch.step;

import java.util.List;

import org.springframework.batch.item.ItemWriter;

import com.ashish.spring.batch.config.Registration;

public class BatchItemWriter implements ItemWriter<Registration> {

	@Override
	public void write(List<? extends Registration> messages) throws Exception {
		System.out.println("Writing "+messages);
		for (Registration msg : messages) {
			System.out.println("Writing the data using batch writer: " + msg.getFirst());

		}
//		System.out.println("Writing "+messages);
	}

}
