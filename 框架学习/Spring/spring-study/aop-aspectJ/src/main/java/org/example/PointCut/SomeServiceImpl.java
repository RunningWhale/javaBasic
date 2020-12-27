package org.example.PointCut;

public class SomeServiceImpl implements SomeService {
    @Override
    public void doThird(String name, int age) {
        System.out.println("执行doThird方法");
    }
}
