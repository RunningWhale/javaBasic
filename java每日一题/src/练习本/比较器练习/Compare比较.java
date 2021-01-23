package 练习本.比较器练习;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.PriorityQueue;

public class Compare比较 {
    public static void main(String[] args) {
        Student s1=new Student("张三",15);
        Student s4=new Student("张三",15);
        Student s2=new Student("李四",25);
        Student s3=new Student("王五",35);
        Student[] students=new Student[4];
        students[0]=s2;
        students[1]=s1;
        students[2]=s4;
        students[3]=s3;
        System.out.println(Arrays.toString(students));

        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getAge()-o1.getAge();
            }
        });
        System.out.println(Arrays.toString(students));


        System.out.println("--------------");
//        PriorityQueue<Student> priorityQueue=new PriorityQueue<>(new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o2.getAge()-o1.getAge();
//            }
//        });
        bijiao bijiao=new bijiao();
        PriorityQueue<Student> priorityQueue=new PriorityQueue<>();
        priorityQueue.offer(s1);
        priorityQueue.offer(s3);

        priorityQueue.offer(s2);
        System.out.println(priorityQueue);


    }
}
class bijiao implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o2.getAge()-o1.getAge();
    }
}
class Student implements Comparable  {
    private int age;
    private String name;

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student( String name,int age) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}