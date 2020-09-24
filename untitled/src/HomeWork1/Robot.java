package HomeWork1;

public class Robot implements Competitor {
    private static int iterator = 1;
    private String name = "Robot" + iterator;
    private int run = 0;

    final private int MAX_RUN = 900;
    final private int MAX_JUMP = 2;
    private boolean readyPerson = true;

    public Robot(String name) { this.name = name; }

    public Robot() { iterator++; }

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
