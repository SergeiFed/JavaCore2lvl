package lesson1;

@FunctionalInterface
public interface Runnable {
    default void run() {
        System.out.println("run!!!!!!!");
    };

    void run(int n);
}
