package com.kototo.starter.service;

import com.kototo.starter.properties.RobotProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RobotService {

    @Autowired
    RobotProperties robotProperties;

    public String sayHello(){
        return "你好：名字：【"+robotProperties.getName()+"】;年龄：【"+robotProperties.getAge()+"】";
    }
}