package com.tao.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Demo {
  private String name;
  private int status = -1;

  public Demo() {}

  public Demo(String name, int status) {
    this.name = name;
    this.status = status;
  }
}
