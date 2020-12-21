package 模拟银行取钱多线程安全问题使用同步锁解决问题;

//使用同步机制，解决安全问题
public class Test {
    public static void main(String[] args) {
        Account account = new Account("张三", 10000);
        Thread thread = new AccountThread(account);
        Thread thread1 = new AccountThread(account);
        thread.start();
        thread1.start();

    }
}
