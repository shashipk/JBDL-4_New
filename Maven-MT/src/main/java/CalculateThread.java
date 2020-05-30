import java.math.BigInteger;

public class CalculateThread {

    public static void main(String[]args) throws InterruptedException {

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        // 10 + 15 = 25 secs

        long start = System.currentTimeMillis();

//        t1.start(); // 10 sec
//        t2.start(); // 15 secs
//
//        t1.join(); // 10 secs
//        t2.join(); // 5 secs


        // Time taken = Max(T(i)) = 40 secs
        // Time taken = SUM(T(i)) for i >= 0

        System.out.println(t1.result - t2.result);

        long end = System.currentTimeMillis();

        int n = 1000000; // 5 secs




    }

    private static class MyThread extends Thread{

        private int result;

        @Override
        public void run() {

            long start = System.currentTimeMillis();
            // 30
            // finding sum of squares

            long end = System.currentTimeMillis();
        }
    }
}
