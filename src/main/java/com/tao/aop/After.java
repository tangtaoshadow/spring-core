package com.tao.aop;

import java.lang.reflect.Method;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.aop.AfterReturningAdvice;

@ToString
@Getter
@Setter
public class After implements AfterReturningAdvice {

  @Override
  public void afterReturning(Object o, Method method, Object[] objects, Object o1)
      throws Throwable {
    System.out.println("---------   After implements AfterReturningAdvice   ----------");
    System.out.println("Method: " + method.getName() + " 目标对象: " + o1 + " 返回结果: " + o);
  }
}
