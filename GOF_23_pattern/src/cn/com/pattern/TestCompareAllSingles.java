package cn.com.pattern;

import java.util.concurrent.CountDownLatch;

public class TestCompareAllSingles {
    //测试多线程环境下5种单例模式的效率
    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        int threadNum = 20;
        //线程计数器
        final CountDownLatch countDownLatch = new CountDownLatch(threadNum);
        for (int i = 0; i < threadNum; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 1000000; i++) {
//                        Object o = SingleDemo04.getInstance();
                        Object o = SingleDemo05.INSTANCE;
                    }
                    countDownLatch.countDown();//一个线程执行完，计数器减一
                }
            }).start();
        }
        countDownLatch.await();//main线程阻塞，直到计数器变为0，才会继续往下执行
        long end = System.currentTimeMillis();
        System.out.println("需要花费时间为："+(end-start));
    }
}
