package com.tao.aop;

import java.lang.reflect.Method;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.aop.MethodBeforeAdvice;

@ToString
@Getter
@Setter
public class Before implements MethodBeforeAdvice {

  @Override
  public void before(Method method, Object[] objects, Object o) throws Throwable {
    System.out.println("---------   Before implements MethodBeforeAdvice   ----------");
    System.out.println("目标对象：" + o.getClass().getName() + " Method：" + method.getName());
  }
}
