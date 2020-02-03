package com.tao.service;

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
