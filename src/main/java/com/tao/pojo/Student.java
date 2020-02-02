package com.tao.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;

@ToString
@Getter
@Setter
public class Student {
  private String name;
  @Autowired private Demo demo;
}
