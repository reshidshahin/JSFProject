package com.shahin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        //Setter ile injection
        Employee e1 = (Employee) context.getBean("employee");
        System.out.println(e1);


        //Constructor ile injection
        Employee e2= (Employee) context.getBean("employee2");
        System.out.println(e2);

        ((ClassPathXmlApplicationContext)context).close();

    }
}
