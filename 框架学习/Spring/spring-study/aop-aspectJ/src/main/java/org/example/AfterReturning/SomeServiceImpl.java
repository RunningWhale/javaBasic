package org.example.AfterReturning;

public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome(String name, int age) {
        System.out.println("目标方法doSome");

    }

    @Override
    public String doOther(String name, int age) {
        System.out.println("目标方法doOther");
        return "aaa";
    }
}
