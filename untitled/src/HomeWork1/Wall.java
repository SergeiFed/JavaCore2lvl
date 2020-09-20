package HomeWork1;

public class Wall implements Obstacles {
    private int wallHeight = 1 + (int) (Math.random() * 4);

    public int getWallHeight() { return wallHeight; }

    @Override
    public void test(Competitor j) {
        if (!j.getReadyPerson()) {
            return;
        }
        if (wallHeight > j.getMAX_JUMP()) {
            j.setReadyPerson(false);
            j.jump();
            System.out.println(j.getName() + " не смог перепрыгнуть стену в " + wallHeight + "м.");
        } else {
            j.jump();
            System.out.println("Поздравим " + j.getName() + " смог перепрыгнуть стену в " + wallHeight + "м.");
        }
    }
}
