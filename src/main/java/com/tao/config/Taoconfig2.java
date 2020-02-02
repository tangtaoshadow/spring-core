package com.tao.config;

import com.tao.pojo.Demo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// 代表这是一个配置类 将被 spring 托管
@Configuration
// 显式指定扫描包
@ComponentScan("com.tao.pojo")
public class Taoconfig2 {

  //  注入的bean 相当于 xml中的 <bean>
  @Bean
  public Demo getDemo() {
    System.out.println("--- spring getDemo ---");
    return new Demo();
  }
}
