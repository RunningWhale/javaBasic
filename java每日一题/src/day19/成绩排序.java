package day19;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class 成绩排序 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int paiXu = sc.nextInt();
        sc.nextLine();
        Student[] students = new Student[num];
        for (int i = 0; i < num; i++) {
            String s = sc.nextLine();
            String[] s1 = s.split(" ");
            int score = Integer.valueOf(s1[1]);
            String name = s1[0];
            Student student = new Student(score, name);
            students[i] = student;
        }
        Comparator<Student> comparator=new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getScore()-o2.getScore();
            }
        };
        Arrays.sort(students,comparator);
        /*for (Student student:students){
            System.out.println(student.getName()+" "+student.getScore());
        }*/
        /*for (int i = 0; i < num - 1; i++) {
            for (int j = 0; j < num - 1 - i; j++) {
                if (students[j].getScore() > students[j + 1].getScore()) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }*/
        if (paiXu==1){
            for (Student s:students){
                System.out.println(s.getName()+" "+s.getScore());
            }
        }else {
            for (int i=num-1;i>=0;i--){
                System.out.println(students[i].getName()+" "+students[i].getScore());
            }
        }
    }
}

class Student {
    private int score;
    private String name;

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

    public Student(int score, String name) {

        this.score = score;
        this.name = name;
    }
}