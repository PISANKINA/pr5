package ex1;

public class Program {
    public static void main(String[] args) throws InterruptedException {
        var myThread = new MyThread();
        myThread.start();
        String state = "";
        while (myThread.isAlive())
        {
            var currentState = myThread.getState().toString();
            if (!currentState.equals(state))
            {
                state = currentState;
                System.out.println(myThread.getState());
            }
        }

        System.out.println(myThread.getState());




        //System.out.println(myThread.getState());

        /*var object = new Object();

        System.out.println(myThread.getState());

        synchronized (myThread) {
            *//*var thread2 = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        myThread.wait(10000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            thread2.run();*//*
            //myThread.wait();

            System.out.println(myThread.getState());
            myThread.notifyAll();
            //thread2.notifyAll();

        }
        System.out.println(myThread.getState());

        myThread.join();

        System.out.println(myThread.getState());*/
    }
}
