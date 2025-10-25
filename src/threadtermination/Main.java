package threadtermination;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        Thread normalThread = new Thread(new NormalThread());
//        System.out.println("main start");
//        normalThread.start();
//        System.out.println("send interrupt signal");
//        normalThread.interrupt();

        Thread loopThread = new Thread(new LoopThread());
        loopThread.start();
        Thread.sleep(100);
        loopThread.interrupt();
    }
}
