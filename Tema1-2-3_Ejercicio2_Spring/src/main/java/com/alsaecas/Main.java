package com.alsaecas;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserService service = (UserService) context.getBean("userService");
        service.notification.imprimirSaludo();

    }
}
