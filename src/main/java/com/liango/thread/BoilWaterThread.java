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
            System.out.println("��ʼ�տ�ˮ...�߳����ƣ�" + Thread.currentThread().getName());
            Thread.sleep(10000);
            System.out.println("�տ�ˮ�����ˡ��߳����ƣ�" + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
