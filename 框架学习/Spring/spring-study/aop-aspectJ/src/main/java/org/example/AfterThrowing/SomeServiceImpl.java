package org.example.AfterThrowing;

public class SomeServiceImpl implements SomeService {
    @Override
    public void doSecond(String name, int age) {
        System.out.println(10/0);
    }
}
