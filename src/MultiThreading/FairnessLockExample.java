package MultiThreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FairnessLockExample {

    Lock lock = new ReentrantLock(true);
    public void method1(){
        lock.lock();
        System.out.println("Thread "+ Thread.currentThread().getName() + " has acquired the lock");
        try{
            Thread.sleep(3000);
        } catch (Exception e){
            System.out.println("This thread is interrupted "+ Thread.currentThread().getName());
            Thread.interrupted();
        } finally {
            System.out.println("Thread "+ Thread.currentThread().getName() + " has released the lock");
            lock.unlock();
        }
    }
}