public class MainThread extends Thread {

    MainThread() {}
    public MainThread(String name) {
        super(name);
    }
    @Override
    public void run() {
        System.out.println("Main thread is running");
        System.out.println("This is " + Thread.currentThread().getName());

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        throw new RuntimeException();
    }
}
