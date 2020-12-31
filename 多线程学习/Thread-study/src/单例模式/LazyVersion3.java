package 单例模式;

// 1. 为什么要二次判断
// 2. 性能是怎么提高的
//3、 instance = new LazyVersion3();  可能会被重排序
public class LazyVersion3 {
    private static LazyVersion3 instance = null;

    public static LazyVersion3 getInstance() {
        if (instance == null) {
            // 100年的1秒
            synchronized (LazyVersion3.class) {
                // 能 保证 instance 还是 null
                if (instance == null) {
                    instance = new LazyVersion3();
                }
            }
        }

        return instance;
    }
}
