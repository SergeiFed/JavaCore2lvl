package HomeWork1;

public interface Competitor {
    int run = 0;
    String name = null;
    int MAX_RUN = 0;
    int MAX_JUMP = 0;
    boolean readyPerson = true;

    default void setRun(int run) { }
    default void setReadyPerson(boolean readyPerson) { }

    default int getRun() { return run; }
    default boolean getReadyPerson() { return readyPerson; }
    default String getName() { return name; }
    default int getMaxRun() { return MAX_RUN; }
    default int getMAX_JUMP() { return MAX_JUMP; }

    void jump();
    void run();


}
