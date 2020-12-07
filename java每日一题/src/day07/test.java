package day07;

public class test {
    private static int a=10;
    public static void main(String[] args) {
        test t=new test();
        t.a++;
        System.out.println(t.a);
        test t1=new test();
        t1.a++;
        t=new test();
        System.out.println(t.a);
        Object o=new Object();

    }
}
