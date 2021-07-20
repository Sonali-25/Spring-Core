package com.magic.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ContainersIOC {
    public static void main( String[] args ) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
        Car car = ctx.getBean(Car.class);
        Bike bike = ctx.getBean(Bike.class);
        System.out.println(car.getName() +" "+ car.getModel());
        System.out.println(bike.name);


    }
}
