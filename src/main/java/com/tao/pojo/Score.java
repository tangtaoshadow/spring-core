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
public class Score {
  @Value("tangtao")
  private String name;

  @Value("2020-2-3 01:14:09")
  private String date;

  @Value("8")
  private int value = 0;
}
