package com.tao.pojo;

import javax.annotation.Resource;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@ToString
@Getter
@Setter
// 代表此类将被 spring 托管
@Component
// 声明为 原型
@Scope(value = "prototype")
public class Student {

  @Value("student 01")
  private String name;

  @Autowired(required = false)
  private Demo demo;

  @Resource(type = Score.class)
  private Score score;
}
