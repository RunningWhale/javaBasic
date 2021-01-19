package 比较方法;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("aa", 15);
        Student s2 = new Student("aa", 17);
        Student s3 = new Student("aa", 16);
        Student[] students = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        AgeComparator ageComparator=new AgeComparator();
        Arrays.sort(students,ageComparator);
        System.out.println(Arrays.toString(students));
    }
}
