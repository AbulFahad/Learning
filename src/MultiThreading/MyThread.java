package MultiThreading;

public class MyThread extends Thread{

    Counter counter;

    public MyThread(Counter counter){
        this.counter = counter;
    }

    @Override
    public void run() {
        for(int i = 0; i<10000; i++){
            counter.increment();
        }
    }
}
