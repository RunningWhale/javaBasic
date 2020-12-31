package 单例模式;

// 线程安全了
// 性能不高
public class LazyVersion2 {
    private static LazyVersion2 instance = null;

    public static LazyVersion2 getInstance() {
        synchronized (LazyVersion2.class) {
            if (instance == null) {
                instance = new LazyVersion2();
            }
        }

        return instance;
    }
}
