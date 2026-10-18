import MultiThreading.Counter;
import MultiThreading.FairnessLockExample;
import MultiThreading.MyThread;

public class Main {

    public static void main(String[] args) {

    }
}
/* --This example is for synchronization--
Counter counter = new Counter();

MyThread t1 = new MyThread(counter);
MyThread t2 = new MyThread(counter);
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println(counter.getCount());*/

/* --This is for fairness lock--
FairnessLockExample fairnessLockExample = new FairnessLockExample();
Runnable run = new Runnable() {
    @Override
    public void run() {
        fairnessLockExample.method1();
    }
};

Thread t1 = new Thread(run,"Thread 1");
Thread t2 = new Thread(run,"Thread 2");
Thread t3 = new Thread(run,"Thread 3");
Thread t4 = new Thread(run,"Thread 4");
        try{
                t1.start();
            Thread.sleep(5000);
            t2.start();
            Thread.sleep(5000);
            t3.start();
            Thread.sleep(5000);
            t4.start();
        } catch (Exception e){

        }*/
