package threadtermination;

public class LoopThread implements Runnable{

    @Override
    public void run() {
        int base = 1;
        for (int i=1;i<10000000;i++){
            if(Thread.currentThread().isInterrupted()){
                System.out.println("thread interrupted");
                return;
            }
            System.out.println(i+":"+base);
            base = base*i;
        }

        System.out.println("sum="+base);
    }
}
