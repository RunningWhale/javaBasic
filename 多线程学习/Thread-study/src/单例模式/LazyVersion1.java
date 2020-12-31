package 单例模式;

// 不是线程安全的
public class LazyVersion1 {
    private static LazyVersion1 instance = null;

    public static LazyVersion1 getInstance() {
        // 有人要用到该对象了
        if (instance == null) {
            // 第一次的时候，进行实例化，以后不再进行
            instance = new LazyVersion1();
        }

        return instance;
    }
}
