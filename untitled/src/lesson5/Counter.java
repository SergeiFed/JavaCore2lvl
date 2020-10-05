package lesson5;

public class Counter {
    private int c;
    private Object mon = new Object();

    public Counter() {
        this.c = 0;
    }

    public synchronized void inc() {
        c++;
    }

    public synchronized void dec() {
        c--;
    }

    public int getC() {
        return c;
    }

//    public void inc() {
//        synchronized (mon){
//            c++;
//        }
//    }
//
//    public void dec() {
//        synchronized (mon){
//            c--;
//        }
//    }

}
