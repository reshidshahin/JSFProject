package com.shahin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {


        ApplicationContext context=new ClassPathXmlApplicationContext("spring-config.xml");
        Cars cars= (Cars) context.getBean("Cars");
        System.out.println(cars);

        ((ClassPathXmlApplicationContext)context).close();
    }
}
