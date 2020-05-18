package org.zxl.dubbodemo.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.zxl.dubbodemo.interfaces.DemoService;

public class Application {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo-consumer.xml");
        context.start();
        DemoService demoService = (DemoService) context.getBean("demoService");
        String hello = demoService.sayHello("world"); // 执行远程方法
        System.out.println( hello ); // 显示调用结果
    }
}
