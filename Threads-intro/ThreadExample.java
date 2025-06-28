public class ThreadExample {


    public static void main(String[] args) {
        // Create two threads
        Thread thread1 = new MyThread("Thread 1");
        Thread thread2 = new MyThread("Thread 2");
        Thread thread3 = new MyThread("Thread 3");
        Thread thread4 = new MyThread("Thread 4");

        // Start the threads
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }

    static class MyThread extends Thread {
        private String name;

        public MyThread(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println(name + " is running. Count: " + i);
                try {
                    Thread.sleep(1000); // Simulate some work
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}