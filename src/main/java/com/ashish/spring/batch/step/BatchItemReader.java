package com.ashish.spring.batch.step;

import ch.qos.logback.classic.util.ContextInitializer;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BatchItemReader implements ItemReader<String> {

	private String[] messages = { "Hello World",
			"Welcome to Spring Batch using Spring boot Example",
			"H2 Database has been used in this example" };

	private int count = 0;
	Connection conn = null;
	ResultSet rs = null;

	@Override
	public String read() throws Exception, UnexpectedInputException,
			ParseException, NonTransientResourceException {



		System.out.println("Reading");
		if(conn==null)
		{
			conn = ConnectionUtil.connect();
		}
		Statement stmt = conn.createStatement();
		//STEP 3: Execute a query

		String sql = "SELECT id, first, last, age FROM Registration";
		if(rs==null)
		{
			rs = stmt.executeQuery(sql);
		}
		if(rs.next())
		{
			return rs.getString("first");
//			/return Arrays.asList("anup","anup1");
		}
		else{
			rs=null;
			return null;
		}
//		String first;
//		// STEP 4: Extract data from result set
//		while(rs.next()) {
//			// Retrieve by column name
//			int id  = rs.getInt("id");
//			int age = rs.getInt("age");
//			 name.add(rs.getString("first"));
//			String last = rs.getString("last");
//
//			// Display values
//			System.out.print("ID: " + id);
//			System.out.print(", Age: " + age);
//			System.out.println(", Last: " + last);
//		}

//		// STEP 4: Clean-up environment
//		stmt.close();
//		conn.close();

	}

}
