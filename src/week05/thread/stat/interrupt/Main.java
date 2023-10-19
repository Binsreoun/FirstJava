package week05.thread.stat.interrupt;

public class Main {
//    public static void main(String[] args) {
//        Runnable task = () -> {
//            try {
//                Thread.sleep(3000);
//                System.out.println(Thread.currentThread().getName());
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println("task : " + Thread.currentThread().getName());
//        };
//
//        Thread thread = new Thread(task, "Thread");
//        thread.start();
//
//        thread.interrupt();
//
//        System.out.println("thread.isInterrupted() = " + thread.isInterrupted());
//
//    }
    public static void main(String[] args) {
        Runnable task = () -> {
            while (!Thread.currentThread().isInterrupted()) {//에러없이 바로깨움
                try {
                    Thread.sleep(3000);
                    System.out.println(Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    break;
                }
            }
            System.out.println("task : " + Thread.currentThread().getName());
        };

        Thread thread = new Thread(task, "Thread");
        thread.start();

        thread.interrupt();

        System.out.println("thread.isInterrupted() = " + thread.isInterrupted());

    }
}