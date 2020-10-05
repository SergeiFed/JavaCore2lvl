package lesson5;

public class CounterDoubleSynh {
    private int c;
    private int d;
    private Object mon = new Object();
    private Object mon2 = new Object();

    public CounterDoubleSynh() {
        this.c = 0;
        this.d = 0;
    }

    public int getC() {
        return c;
    }

    public void inc() {
        synchronized (mon){
            c++;
        }
    }

    public void dec() {
        synchronized (mon){
            c--;
        }
    }

    public void inc1() {
        synchronized (mon2){
            d++;
        }
    }

    public void dec1() {
        synchronized (mon2){
            d--;
        }
    }

}
