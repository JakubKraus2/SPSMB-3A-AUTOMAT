package cz.spsmb.a3;

import java.util.Scanner;

public class Application {

    public static final int num_1 = 1;
    public static final int num_2 = 2;
    public static final int num_5 = 5;
    public static final int num_10 = 10;
    public static final int num_20 = 20;
    public static final int num_50 = 50;
    public static final int num_100 = 100;
    public static final int num_200 = 200;
    public static final int num_500 = 500;
    public static final int num_1000 = 1000;
    public static final int num_2000 = 2000;
    public static final int num_5000 = 5000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int numberBefore = number;

        int[] money = {num_1, num_2, num_5, num_10, num_20, num_50, num_100, num_200, num_500, num_1000, num_2000, num_5000};

        for (int i = money.length - 1; i >= 0; i--) {
            if (number / money[i] == 1 || number / money[i] == 2) {
                numberBefore = number;
                number = number % money[i];
                System.out.println(numberBefore / money[i] + "x " + money[i]);
            }
        }
    }
}
