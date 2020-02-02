package com.tao.config;

import com.tao.pojo.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

// 代表这是一个配置类 将被 spring 托管
@Configuration
// 显式指定扫描包
@ComponentScan("com.tao.pojo")
// 再导入一个配置类 合并到当前类中
@Import(Taoconfig2.class)
public class Taoconfig {

  //  注入的bean 相当于 xml中的 <bean>
  @Bean
  public Student getStudent() {
    System.out.println("--- spring getStudent ---");
    return new Student();
  }
}
