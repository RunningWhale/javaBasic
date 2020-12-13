package day09;

public class Test {
    public static void main(String[] args) {

    }
}

class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }
}

class Employee extends Person {
    String id;

    public Employee(String id) {
        super(id);

        this.id = name;
    }
}
