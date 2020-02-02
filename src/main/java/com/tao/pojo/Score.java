package com.tao.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Score {
  private String name;
  private String date;
  private int value = 0;
}
