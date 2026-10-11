import MultiThreading.World;

import java.sql.SQLSyntaxErrorException;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() ->
        {
            for(int i=100; i<110; i++){
                System.out.println(i + "This thread is "+ Thread.currentThread().getName());
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        t1.setDaemon(true);
        t1.start();
        Thread.sleep(4000);
        /*for(int i=11; i<=20; i++){
            System.out.println(i + " The count it from thread - "+Thread.currentThread().getName());
            Thread.sleep(5000);
        }*/

    }
}
