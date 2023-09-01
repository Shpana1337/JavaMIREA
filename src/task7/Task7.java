package task7;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Введите число: ");
            if (sc.hasNextInt()) {
                int inputValue = sc.nextInt();
                System.out.printf("Факториал числа %d = %d", inputValue, fact(inputValue));
            }
        }
    }

    public static int fact(int value) {
        if (value == 0) {
            return 1;
        } else {
            int l = 1;
            for (int i = 1; i <= value; i++) {
                l *= i;
            }
            return l;
        }
    }
}
