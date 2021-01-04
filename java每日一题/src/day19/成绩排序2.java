package day19;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class 成绩排序2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
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
                    if (paiXu==1){
                        return o1.getScore()-o2.getScore();
                    }else {
                        return o2.getScore()-o1.getScore();

                    }
                }
            };
            Arrays.sort(students,comparator);
            for (Student s:students){
                System.out.println(s.getName()+" "+s.getScore());
            }
        }
    }
}
