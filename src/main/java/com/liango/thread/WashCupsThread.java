package com.liango.thread;

/**
 * @author liango
 * @version 1.0
 * @since 2015-08-08 0:53
 */
public class WashCupsThread extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("开始洗第" + i + "个杯子... 线程名称：" + Thread.currentThread().getName());
                Thread.sleep(1500);
                System.out.println("第" + i + "个杯子洗完了。线程名称：" + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
