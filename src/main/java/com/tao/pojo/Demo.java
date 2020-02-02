package com.tao.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@ToString
@Getter
@Setter
@Component
public class Demo {

  @Value("Demo 01")
  private String name;

  private int status = -1;

  public Demo() {}

  public Demo(String name, int status) {
    this.name = name;
    this.status = status;
  }
}
