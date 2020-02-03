package com.tao.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// 代表这是一个配置类 将被 spring 托管
@Configuration
// 显式指定扫描包
@ComponentScan("com.tao")
public class Taoconfig3 {}
