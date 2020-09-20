package HomeWork1;

public class Treadmill implements Obstacles {
    private int PathLength = 100 + (int) (Math.random() * 300);

    public int getPathLength() { return PathLength; }

    @Override
    public void test(Competitor j) {
        if (!j.getReadyPerson()) {
            return;
        }

        if (j.getMaxRun() <= j.getRun()) {
            j.setReadyPerson(false);
            j.run();
            System.out.println(j.getName() + " не смог пробежать дистанцию в " + this.getPathLength() + "м.");
        } else {
            j.run();
            System.out.println("Поздравим " + j.getName() + " Он смог пробежать дистанцию в " + this.getPathLength() + "м.");
            j.setRun(j.getRun() + this.getPathLength());
        }
    }


}


