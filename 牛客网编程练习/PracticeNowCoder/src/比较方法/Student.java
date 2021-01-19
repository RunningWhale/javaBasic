package 比较方法;

public class Student {

    @Override
    public boolean equals(Object obj) {
        Student obj1 = (Student) obj;
        if (obj1.name.equals(this.name) && obj1.age == this.age) {
            return true;
        }
        return false;
    }

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    /*@Override
    public int compareTo(Student o) {
        Student o1 = (Student) o;
        return o1.age - this.age;
    }*/
}
