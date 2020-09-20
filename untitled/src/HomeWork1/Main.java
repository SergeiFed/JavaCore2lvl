package HomeWork1;

public class Main {
    public static void main(String[] args) {
        Competitor[] competitor = new Competitor[]{new Cat(), new Human(), new Robot()};

        Obstacles[] obstacles = new Obstacles[]{new Wall(), new Treadmill(), new Wall(), new Treadmill(),
                new Wall(), new Treadmill()};
        for (int i = 0; i < competitor.length; i++) {

            for (int j = 0; j < obstacles.length; j++) {
                obstacles[i].test(competitor[i]);
            }
        }


    }
}
