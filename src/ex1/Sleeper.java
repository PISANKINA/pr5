package ex1;

public class Sleeper {

    public static void sl() throws InterruptedException {
        var object = new Object();

        synchronized (object) {
            Thread.sleep(1000);
        }
    }
}
