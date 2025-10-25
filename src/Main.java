//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Thread mainthread = new Thread(new MainThread());
    mainthread.setName("Main thread");

    Thread secondThread = new Thread(new SecondThread());
    secondThread.setName("Second thread");
    secondThread.setPriority(Thread.MAX_PRIORITY);

    System.out.println(secondThread.getName());
    System.out.println(secondThread.getPriority());

    mainthread.start();

    mainthread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
        public void uncaughtException(Thread t, Throwable e) {
            System.out.println("Uncaught exception in thread " + t.getName());
        }
    });
    secondThread.start();
}
