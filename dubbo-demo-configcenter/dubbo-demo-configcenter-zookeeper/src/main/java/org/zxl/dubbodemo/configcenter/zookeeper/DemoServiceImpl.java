package org.zxl.dubbodemo.configcenter.zookeeper;

import org.zxl.dubbodemo.interfaces.DemoService;

public class DemoServiceImpl implements DemoService {
    public String sayHello(String name) {
        System.out.println("接受到请求："+name);
        return "Hello "+name;
    }
}
