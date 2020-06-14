public class CustomThread {

    public static void main(String[]args){

        Animal a1 = new Animal("tom", "cat");
        Animal a2 = new Animal("bashooka", "tiger");


        MyThread thread1 = new MyThread(a1);
        MyThread thread2 = new MyThread(a1);

        thread1.start();

    }

    private static class MyThread extends Thread{

        private volatile Animal animal;

        public MyThread(Animal animal) {
            this.animal = animal;
        }

        @Override
        public void run() {
            synchronized (this.animal) {
                System.out.println("current thread : " + currentThread().getName() + ", animal : " + this.animal + "thread obj" + this);
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
