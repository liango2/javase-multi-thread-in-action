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
                System.out.println("��ʼϴ��" + i + "������... �߳����ƣ�" + Thread.currentThread().getName());
                Thread.sleep(1500);
                System.out.println("��" + i + "������ϴ���ˡ��߳����ƣ�" + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
