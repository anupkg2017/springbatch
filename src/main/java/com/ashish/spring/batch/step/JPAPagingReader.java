package com.ashish.spring.batch.step;

import javax.persistence.EntityManagerFactory;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.database.JpaPagingItemReader;
import org.springframework.beans.factory.annotation.Autowired;

import com.ashish.spring.batch.config.Registration;

public class JPAPagingReader implements ItemReader<JpaPagingItemReader<Registration>>
{



  @Autowired
  private EntityManagerFactory entityManagerFactory;



  public JpaPagingItemReader<Registration> read() throws Exception {

    JpaPagingItemReader<Registration> reader = new JpaPagingItemReader<Registration>();
    reader.setEntityManagerFactory(entityManagerFactory);
    reader.setQueryString("select u from Registration u");
    reader.setPageSize(3);
    try
    {
      reader.afterPropertiesSet();
    }
    catch (Exception e)
    {
    }
    return reader;
  }




}
