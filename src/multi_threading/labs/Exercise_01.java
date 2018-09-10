package multi_threading.labs;

/**
 * Multithreading Exercise 1:
 *
 *      Create an application that creates a Thread using the Runnable interface
 */

class Controller1 {
    public static void main(String[] args) {
        RunnableClass runnableClass = new RunnableClass();
    }
}

class RunnableClass implements Runnable {

    Thread thread;

    RunnableClass () {

        thread = new Thread(this,"Thread 1");

        thread.start();
    }

    public void run() {
        System.out.println(thread.getName() + " starting.");

        System.out.println(thread.getName() +  " running.");

        System.out.println(thread.getName() + " terminating.");
    }
}