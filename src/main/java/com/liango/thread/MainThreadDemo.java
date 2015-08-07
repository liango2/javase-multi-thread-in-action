package com.liango.thread;

/**
 * @author liango
 * @version 1.0
 * @since 2015-08-08 0:16
 */
public class MainThreadDemo extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName() + "------- i = " + i);
        }
        
    }

    public static void main(String[] args) {
        // 启动另外一个线程
        new MainThreadDemo().start();

        // 打印主函数线程
        Thread thread = Thread.currentThread();
        System.out.println("thread = " + thread);
        try {
            for (int i = 0; i < 1000; i++) {
                System.out.println(Thread.currentThread().getName() + " i = " + i);
                Thread.sleep(2000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("-----------------------------");



    }


}
