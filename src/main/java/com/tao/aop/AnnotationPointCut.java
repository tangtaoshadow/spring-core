package com.tao.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
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

  // around 在 before 前 ; 在 after 前
  @Around("execution(* com.tao.service.AppleServiceImpl.*(..))")
  public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
    System.out.println("=========   AnnotationPointCut around start    ==========");
    Signature signature = proceedingJoinPoint.getSignature();
    System.out.println("signature: " + signature);
    // 执行方法  它会在执行方法前调用 before
    Object proceed = proceedingJoinPoint.proceed();
    System.out.println("proceed: " + proceed);
    System.out.println("=========   AnnotationPointCut around end      ==========");
    //  函数完成后会执行 after
  }
}
