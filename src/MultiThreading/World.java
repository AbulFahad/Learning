package MultiThreading;

import java.lang.reflect.Method;

public class World extends Thread{


    @Override
    public void run() {
        for(int i=0; i<=10; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
    }
}
/*
ADD THIS IN MAIN Method
World world = new World();
Thread t1 = new Thread(world);
        t1.setDaemon(true);
        t1.start();
        Thread.sleep(5100);*/
