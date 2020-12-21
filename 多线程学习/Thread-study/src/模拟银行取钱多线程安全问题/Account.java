package 模拟银行取钱多线程安全问题;

public class Account {
    private String name;
    private double account;

    public Account(String name, double account) {
        this.name = name;
        this.account = account;
    }

    public double getAccount() {
        return account;
    }

    public void setAccount(double account) {
        this.account = account;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void withdraw(double money) throws InterruptedException {
        double v = this.account - money;
        Thread.sleep(1000);
        this.account = v;
        System.out.println("此时余额" + this.account);
    }


}
