package multi_threading.labs;

import org.omg.PortableServer.THREAD_POLICY_ID;

/**
 * Multithreading Exercise 2:
 *
 *      Create an application that creates a Thread using the Thread class
 */

class Controller2 {
    public static void main(String[] args) {
        System.out.println("Start main thread");
        Thread1 thread1 = new Thread1("Thread 1");
        thread1.setPriority(1);
        Thread1 thread2 = new Thread1("Thread 2");
        thread1.setPriority(2);
        System.out.println("Stop main thread");
    }
}

class Thread1 extends Thread {

    Thread1(String name) {
        super(name);

        start();
    }

    @Override
    public void run() {


        System.out.println(getName() + " starting.");

        try {
            Thread1.sleep(500);
            System.out.println(getName() + " running.");
        }
        catch(Exception e) {
            System.out.println("Exception caught");
        }

        System.out.println(getName() + " stopping.");
    }
}