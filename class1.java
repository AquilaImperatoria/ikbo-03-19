import java.util.Scanner;
import java.util.Arrays;

//Дмитрий Егоров ИКБО-03-19

public class class1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Дмитрий Егоров ИКБО-03-19");
        System.out.println("-----1-----");
        first();
        System.out.println("-----2-----");
        second(args);
        System.out.println("-----3-----");
        third();
        System.out.println("-----4-----");
        fourth();
        System.out.println("-----5-----");
        five();
    }

    static void first() {
        int[] mas = new int[10];
        int sum = 0;
        System.out.println("Введите члены массива");
        for (int i = 0; i < 10; i++) {
            mas[i] = sc.nextInt();
            sum += mas[i];
        }
        System.out.println(sum);
    }

    static void second(String[] args) {
        for (String arg: args)
        {
            System.out.println(args);
        }
    }

    static void third() {
        double[] mas = new double[10];
        mas[0] = 1;
            for (int k = 1; k < 10; k++) {
                mas[k] = 1.0 / (k+1) + mas[k-1];
            }
        for (int i = 0; i < 10; i++) {
            System.out.println(mas[i]);
        }
    }

    static void fourth() {
        int[] mas = new int[10];
        int down = 0;
        int up = 100;
        for (int i = 0; i < 10; i++) {
            mas[i] = (int) (down + Math.random() * (up - down + 1));
        }
        Arrays.sort(mas);
        for (int i = 0; i < 10; i++) {
            System.out.println(mas[i]);
        }
    }

    static void five() {
        int[] mas = new int[10];
        for (int i = 0; i < 10; i++) {
            mas[i] = 1;
        }
        for (int i = 1; i < 10; i++) {
            for (int k = 1; k <= i+1; k++) {
                mas[i] = mas[i] * k;
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(mas[i]);
        }
    }
}
