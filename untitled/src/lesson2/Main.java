package lesson2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
//        try {
//            int a = 1;
//            int b = 5;
//            System.out.println(b / a);
//
//            int[] arr = {3, 4, 5};
//            System.out.println("тут должно быть исключение");
//            arr[99] = 7;
//        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
//            e.printStackTrace();
//        }


//        try {
//            int a = 1;
//            int b = 5;
//            System.out.println(b / a);
//            try {
//                int[] arr = {3, 4, 5};
//                System.out.println("тут должно быть исключение");
//                arr[99] = 7;
//            } catch (ArrayIndexOutOfBoundsException e) {
//                System.out.println("Внутренний");
////                throw e;
//                throw new RuntimeException("Сами создали");
//            }
//
//        } catch (ArithmeticException e) {
//            e.printStackTrace();
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Внешний");
//        } catch (RuntimeException e) {
//            e.printStackTrace();
//        }

//        System.out.println(sqrt(-9));

//        try {
//            int a = 0;
//            int b = 5;
//            System.out.println(b / a);
//        } catch (ArithmeticException e) {
//            e.printStackTrace();
//        } finally {
//            System.out.println("finally");
//        }


//        try {
//            openFileTryWithResourcesT("1.txt");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        try {
//            System.out.println(factorial(-5));
//        } catch (FactorialException e) {
//            System.out.println(e.getMessage());
//            System.out.println(e.getNumber());
//        }

        String[][] w={
                {"5","334564","12"},
                {"53","33","12"},
                {"w5"},
                {"5sy","45","12", "34","1","23"},
                {"5","yutyu","12"},
                {"345234","34","45645"},
        };
        System.out.println(w.length);
        System.out.println(w[2].length);
        int x = Integer.parseInt(w[1][2]);

        System.out.println("END");
    }

    static int factorial(int n) {
        if (n <= 0) {
            throw new FactorialException("arg <0 : " + n, n);
        }

        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }


    static double sqrt(double x) {
        if (x < 0) {
            throw new IllegalArgumentException("argument < 0 " + x);
        }
        return Math.sqrt(x);
    }

    static void openFile(String filename) {
        FileInputStream in = null;
        try {
            in = new FileInputStream(filename);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    static void openFileTryWithResources(String filename) {
        try (FileInputStream in = new FileInputStream(filename)) {

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void openFileTryWithResourcesT(String filename) throws IOException {
        try (FileInputStream in = new FileInputStream(filename)) {

        }
    }

    static void a() {
        b();
    }

    private static void b() {
        c();
    }

    private static void c() {
        d();
    }

    private static void d() {

    }
}
