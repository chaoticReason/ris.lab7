package com.bsuir.stankevich.main;

import com.bsuir.stankevich.service.FiboService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    private static final String CONFIGURATION_PATH = "context.xml";

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext(CONFIGURATION_PATH);

        FiboService service = (FiboService) context.getBean("fiboService");
        System.out.println(service.fiboRow());
    }
}
