package playground;

import java.util.concurrent.*;

public class ExecutorsDemo {
    public static void main(String... args) {
        // var service = Executors.newFixedThreadPool(1);
        // ((ThreadPoolExecutor) service).setMaximumPoolSize(2);
        // ((ThreadPoolExecutor) service).setCorePoolSize(2);
        var service = Executors.newSingleThreadExecutor();
        System.out.println(service.getClass());
        for (int i = 0; i < 10; i++) {
            service.submit(() -> System.out.println(Thread.currentThread()));
        }
    }
}
