package org.example.impl;

import org.example.SomeService;

public class SomeServiceImpl implements SomeService {
    public void doSome() {
        System.out.println("执行了someservice");
    }

    public SomeServiceImpl() {
        System.out.println("无参构造方法");
    }
}
