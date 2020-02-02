package com.tao.pojo;

import javax.annotation.Resource;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@ToString
@Getter
@Setter
@Component
@Scope(value = "prototype")
public class Student {

  private String name;

  @Autowired(required = false)
  private Demo demo;

  @Resource(type = Score.class)
  private Score score;
}
