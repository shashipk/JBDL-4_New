public class MTBasics {

    public static void main(String[]args) throws InterruptedException {

        // 1200, 1300, 100000000000000
        // 4-5 sec, 20-25 sec cap of 10 secs
        MTBasics o = new MTBasics();
//        MyThread thread = o.new MyThread();

        // t1 - t20
        // t21 - t25

        MyThread thread = o.new MyThread();
        try {
            thread.setDaemon(true);
            thread.start();
            Thread.sleep(5000);
            System.out.println("Thread 0 is " + thread.isAlive());
            thread.interrupt();
            Thread.sleep(2000);
            System.out.println("Thread 0 is " + thread.isAlive());

            Thread.currentThread().isAlive();


        }catch (Exception e){
            System.out.println("Application has stopped forcefully");
            thread.interrupt();
        }
//
//        Thread.sleep(40000);

        // setting main thread main as daemon


        // T1 and T2 is daemon / background

        // Garbage collector

    }

    private class MyThread extends Thread{

        public void run() {
            try {

                System.out.println("in thread before sleep:" + Thread.currentThread().getName());
                Thread.sleep(30000);
                System.out.println("in thread after sleep:" + Thread.currentThread().getName());

            } catch (InterruptedException e) {
//                e.printStackTrace();
                System.out.print("Application has stopped forcefully");
            }
        }
    }
}
