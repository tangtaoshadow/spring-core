package com.tao.pojo;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Person {
  private String name;
  private int age;
  private String[] strings;
  private Demo demo;
  private List<String> list;
  private Set<String> set;
  private Map<String, String> map;
  private Properties properties;
}
