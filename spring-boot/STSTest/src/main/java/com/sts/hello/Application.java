package com.sts.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Application.
 *
 */
public class Application {
    /**
     * Sample bootApplication method.
     * @param args String Main Args
     */
    public static void main(final String[] args) {
        @SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");

        HelloWorld obj = (HelloWorld) context.getBean("helloBean");
        obj.printHello();
        System.out.println(context.getClass());
    }
    /**
     * Sample bootApplication method.
     */
    public void bootApplication() {
    }
}
