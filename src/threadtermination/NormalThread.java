package threadtermination;

public class NormalThread implements Runnable{

    @Override
    public void run() {
        try {
            System.out.println("normalThread start");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("thread interrupted");
        }
    }
}
