package com.ashish.spring.batch.config;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.*;
import javax.persistence.Table;

@Entity
@Table(name = "Registration")
public class Registration
{

  @Id
  int id;

  public int getId()
  {
    return id;
  }

  public void setId(int id)
  {
    this.id = id;
  }

  public String getFirst()
  {
    return first;
  }

  public void setFirst(String first)
  {
    this.first = first;
  }

  public String getLast()
  {
    return last;
  }

  public void setLast(String last)
  {
    this.last = last;
  }

  public int getAge()
  {
    return age;
  }

  public void setAge(int age)
  {
    this.age = age;
  }

  String first;
  String last;
  int age;

  public String toString(){
    return this.getFirst();
  }

}
