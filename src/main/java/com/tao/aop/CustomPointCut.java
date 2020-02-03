package com.tao.aop;

public class CustomPointCut {

  public void before(){
    System.out.println("---------   CustomPointCut before   ----------");
  }

   public void after(){
    System.out.println("---------   CustomPointCut after   ----------");
  }


}
