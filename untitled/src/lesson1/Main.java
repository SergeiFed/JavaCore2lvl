package lesson1;

import java.io.Serializable;

public class Main {
    public static void main(String[] args) {
//        Jumpable[] jumpables = {
//                new Cat(),
//                new Kangaroo(),
//                new Kangaroo()
//        };
//
//        for (Jumpable j : jumpables) {
//            j.jump();
//        }


//

        Jumpable catj = new Cat();
        catj.jump();
        ((Cat) catj).run();

        Cat cat = new Cat();
//        cat.run(6);
//
//        System.out.println(cat instanceof Jumpable);

//        testJump(()->{
//            System.out.println("somebody jump...");
//        });


//        testRun((n) -> {
//            System.out.println("run " + n + " meter!!!");
//        });

//        testRun(cat);


        cat.superJump(3,1);


        testRun(new Runnable() {
            @Override
            public void run(int n) {
                System.out.println("asdf");
            }

            @Override
            public void run() {
                System.out.println("cvbcv");
            }
        });
    }

    static void testJump(Jumpable j) {
        j.jump();
    }

    static void testRun(Runnable r) {
        r.run();
        r.run(5);
    }
}
