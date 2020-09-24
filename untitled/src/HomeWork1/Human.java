package HomeWork1;

public class Human implements Competitor {
    private static int iterator = 1;
    private String name = "human" + iterator;
    private int run = 0;
    final private int MAX_RUN = 500;
    final private int MAX_JUMP = 1;
    private boolean readyPerson = true;

    public Human() { iterator++; }

    public Human(String name) { this.name = name; }
    public void setReadyPerson(boolean readyPerson) { this.readyPerson = readyPerson; }
    public void setRun(int run) { this.run = run; }

    public boolean getReadyPerson() { return readyPerson; }
    public int getRun() { return run; }
    public String getName() { return name; }
    public int getMaxRun() { return MAX_RUN; }
    public int getMAX_JUMP() { return MAX_JUMP; }

    @Override
    public void jump() { System.out.println(name + "Совершает прыжек"); }
    @Override
    public void run() { System.out.println(name + "Начинает бег"); }
}
