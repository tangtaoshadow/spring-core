package com.tao.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@ToString
@Getter
@Setter
public class Student {
  private String name;

  @Autowired
  @Qualifier(value = "demo02")
  private Demo demo;
}
