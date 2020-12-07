package day10;

public class Test01 {
    public static void main(String[] args) {
        int a = a(5, 6);
        System.out.println("和是"+ a);
    }
    public static int a(int a,int b){
        try {
            return a+b;
        }catch (Exception e){
            e.printStackTrace();
            System.out.println(111);
        }finally {
            System.out.println("finally");
        }
        return 0;
    }
}
