package com.tao.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class AnnotationPointCut {

  @Before("execution(* com.tao.service.AppleServiceImpl.*(..))")
  public void before() {
    System.out.println("---------   AnnotationPointCut before   ----------");
  }

  @After("execution(* com.tao.service.AppleServiceImpl.*(..))")
  public void after() {
    System.out.println("---------   AnnotationPointCut after    ----------");
  }
}
