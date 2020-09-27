package com.zh.springbootdemo;


import com.zh.springbootdemo.domain.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class SpringbootdemoApplicationTests {

    @Autowired
    Person person;

    @Test
    public void test(){
        System.out.println(person);
    }
}
