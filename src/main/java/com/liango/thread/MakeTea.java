package com.liango.thread;

/**
 * @author liango
 * @version 1.0
 * @since 2015-08-08 13:04
 */
public class MakeTea {
    public static void main(String[] args) {
        Thread boilWaterThread = new BoilWaterThread();
        boilWaterThread.setName("�տ�ˮ");
        boilWaterThread.start();

        Thread washCupsThread = new WashCupsThread();
        washCupsThread.setName("ϴ����");
        washCupsThread.start();



    }
}
