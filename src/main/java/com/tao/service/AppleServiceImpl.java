package com.tao.service;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@ToString
@Getter
@Setter
@Component
public class AppleServiceImpl implements AppleService {

  @Override
  public void query() {
    System.out.println("execute query");
  }

  @Override
  public void update() {
    System.out.println("execute update");
  }

  @Override
  public void delete() {
    System.out.println("execute delete");
  }
}
