package 模拟银行取钱多线程安全问题;

public class AccountThread extends Thread {
    private Account acc;

    public  AccountThread(Account acc) {
        this.acc = acc;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            acc.withdraw(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
