package 模拟银行取钱多线程安全问题;
//不使用同步机制，模拟出现安全问题
public class Test {
    public static void main(String[] args) {
        Account account=new Account("张三",10000);
        Thread thread=new AccountThread(account);
        Thread thread1=new AccountThread(account);
        thread.start();
        thread1.start();

    }
}
