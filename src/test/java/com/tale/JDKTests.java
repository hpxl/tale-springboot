package com.tale;

/**
 * Created by hpxl on 25/6/18.
 */
public class JDKTests {
    public static void main(String[] args) {
        /**
         * 让线程休眠1秒
         */
        Thread t = new Thread(){
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread());
                }
            }
        };
        t.start();
    }
}
