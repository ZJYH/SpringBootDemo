package com.zh.springbootdemo.domain;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;
@Data
@Component
@PropertySource("classpath:person.propertities")
@ConfigurationProperties(prefix = "person")
public class Person {
    private String lastName;
    private int age;
    private Boolean boss;
    private Date birth;
    private Map<String,Object> maps;
    private List<Object> lists;
    private Dog dog;
}
