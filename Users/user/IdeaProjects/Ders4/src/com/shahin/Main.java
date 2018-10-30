package com.shahin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Arabalar araba = (Arabalar) context.getBean("arabalar");
        System.out.println(araba);
        ((ClassPathXmlApplicationContext)context).close();
    }
}
