package org.example.Around;

public class SomeServiceImpl implements SomeService {

    @Override
    public void doSome(String name, int age) {

    }

    @Override
    public String doFirst(String name, int age) {
        System.out.println("业务方法doFirst");
        return "doFirst";
    }
}
