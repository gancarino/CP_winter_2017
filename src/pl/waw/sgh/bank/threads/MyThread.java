package pl.waw.sgh.bank.threads;

public class MyThread extends Thread {

    private String name;
    private int iterator;

    private OurThreads ourThreads;

    public MyThread(String name, OurThreads ourThreads) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            while(iterator < 10 ) {
                iterator++;
                System.out.println(name + " it= "+ iterator);
                ourThreads.increase(name);
                this.sleep(500);
            }
        } catch (InterruptedException ie) {
            System.out.println("Thread " + name + " interrupted!");
        }

    }
}
