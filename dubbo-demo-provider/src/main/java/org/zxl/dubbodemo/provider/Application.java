package org.zxl.dubbodemo.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dobbo-provider.xml");
        context.start();
        System.out.println("启动provider成功");
        System.in.read();
    }
}
