package lesson5;

public class Main {
    public static void main(String[] args) {
//        MyThread t1 = new MyThread("t1");
//        MyThread t2 = new MyThread("t2");
//
//        t1.start();
//        t2.start();

//        t1.run();
//        t2.run();


//        Thread t1 = new Thread(new MyRunnable("t1"));
//        Thread t2 = new Thread(new MyRunnable("t2"));
//
//        t1.start();
//        t2.start();


//        Thread t1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 10; i++) {
//                    System.out.println("t1 " + i);
//                    try {
//                        Thread.sleep(10);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        });
//
//        Thread t2 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 10; i++) {
//                    System.out.println("t2 " + i);
//                    try {
//                        Thread.sleep(10);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        });
//
//        t1.start();
//        t2.start();


//        Thread t1 = new Thread(() -> {
//            for (int i = 0; i < 10; i++) {
//                System.out.println("t1 " + i);
//                try {
//                    Thread.sleep(10);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        });
//
//        Thread t2 = new Thread(() -> {
//            for (int i = 0; i < 10; i++) {
//                System.out.println("t2 " + i);
//                try {
//                    Thread.sleep(10);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        });
//
//        t1.start();
//        t2.start();


//        Thread t1 = new Thread(() -> {
//            System.out.println(Thread.currentThread().getName()+" "+ 1);
//        });
//
//        Thread t2 = new Thread(() -> {
//            System.out.println(Thread.currentThread().getName()+" "+2);
//        });
//
//        t1.start();
//        t2.start();
//
//        System.out.println(Thread.currentThread().getName()+" "+3);

//        Thread t = new Thread(() -> {
//            for (int i = 0; i < 10; i++) {
//                System.out.println(i);
//            }
//        });
//
//        t.start();
//
//        try {
//            t.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

//        System.out.println("END");


//        Counter counter = new Counter();
//
//        Thread t1 = new Thread(() -> {
//            for (int i = 0; i < 1000000; i++) {
//                counter.inc();
//            }
//        });
//
//        Thread t2 = new Thread(() -> {
//            for (int i = 0; i < 1000000; i++) {
//                counter.dec();
//            }
//        });
//
//        t1.start();
//        t2.start();
//
//        try {
//            t1.join();
//            t2.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println(counter.getC());


//        Counter counter = new Counter();
//        Object mon = new Object();
//        Thread t1 = new Thread(() -> {
//            for (int i = 0; i < 1000000; i++) {
//                synchronized (mon){
//                    counter.inc();
//                }
//            }
//        });
//
//        Thread t2 = new Thread(() -> {
//            for (int i = 0; i < 1000000; i++) {
//                synchronized (mon){
//                    counter.dec();
//                }
//            }
//        });
//
//        t1.start();
//        t2.start();
//
//        try {
//            t1.join();
//            t2.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println(counter.getC());


//        Thread t = new Thread(new Runnable() {
//            int seconds = 0;
//            @Override
//            public void run() {
//                while (true) {
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    seconds++;
//                    System.out.println("Time: " + seconds);
//                }
//            }
//        });
//
//        t.setDaemon(true);
//        t.start();
//
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("END");


        Thread t = new Thread(new Runnable() {
            int seconds = 0;
            @Override
            public void run() {
                while (!Thread.currentThread().isInterrupted()) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        break;
                    }
                    seconds++;
                    System.out.println("Time: " + seconds);
                }
            }
        });

        t.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t.interrupt();

        System.out.println("END");
    }
}
