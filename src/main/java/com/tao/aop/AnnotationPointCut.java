package com.tao.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class AnnotationPointCut {

  @Pointcut("execution(* com.tao.service.AppleServiceImpl.delete(..))")
  public void pointCut() {
    //  此处并不执行 它只是一个载体 用来承载 @PointCut 这个注解
    System.out.println("~~~~~~~~   AnnotationPointCut pointCut delete   ~~~~~~~~");
  }

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

  @Before("pointCut()")
  public void beforePointCut() {
    System.out.println("<<<<<<<<<<     beforePointCut     >>>>>>>>>>>");
  }
}
