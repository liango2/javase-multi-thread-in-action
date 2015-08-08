package com.liango.thread;

/**
 * @author liango
 * @version 1.0
 * @since 2015-08-08 0:50
 */
public class BoilWaterThread extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("开始烧开水...线程名称：" + Thread.currentThread().getName());
            Thread.sleep(10000);
            System.out.println("烧开水结束了。线程名称：" + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
