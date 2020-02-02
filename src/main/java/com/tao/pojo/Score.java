package com.tao.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@ToString
@Getter
@Setter
@Component
public class Score {
  private String name;
  private String date;
  private int value = 0;
}
