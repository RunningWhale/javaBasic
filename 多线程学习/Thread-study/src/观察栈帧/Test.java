package 观察栈帧;

public class Test {
    private static void a() {

    }

    private static void b() {
        a();
    }

    private static void c() {
        b();
    }

    private static void d() {
        c();

    }

    private static void e() {
        d();
    }

    public static void main(String[] args) {
        e();
    }
}
