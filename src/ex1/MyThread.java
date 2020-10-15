package ex1;

public class MyThread extends Thread {
    public MyThread() {
        System.out.println(getState());
    }

    @Override
    public void interrupt() {
        super.interrupt();
    }

    @Override
    public void run() {
        System.out.println(getState());

        try {
            sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        var t = new thr();
        t.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        var t2 = new thr();
        t2.start();
        synchronized (t2) {
            try {
                t2.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        /*try {
            Sleeper.sl();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/


        //super.run();
    }
}

class thr extends Thread {
    @Override
    public void run() {
        try {
            Sleeper.sl();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        /*try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
    }
}
