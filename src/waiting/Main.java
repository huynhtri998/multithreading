package waiting;

public class Main {
    static void main() throws InterruptedException {
        Thread threadB = new Thread(new ThreadB());
        threadB.start();
        threadB.join(2000);

        System.out.println("Main thread completed");
    }
}
