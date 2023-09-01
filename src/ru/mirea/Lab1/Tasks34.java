package ru.mirea.Lab1;

import java.util.Scanner;

public class Tasks34 {
    public static void main(String[] args) {
        task3();
        task4();
    }

    public static void task3() {
        int len = 5;
        int[] mass = {1, 2, 3, 4, 5};
        double sum_ = 0;

        System.out.println("\nTask 3");

        for (int i = 0; i < 5; i++) {
            sum_ += mass[i];
            System.out.println(mass[i]);
        }
        System.out.println("Сумма элементов массива: " + sum_ + "\n" +
                "Среднее арифметическое элементов массива: " + (sum_ / len));
    }

    public static void task4() {
        System.out.println("\nTask 4");

        try (Scanner sc = new Scanner(System.in)) {
            int len;

            System.out.println("Введите длину массива: ");

            if (sc.hasNextInt()) {
                len = sc.nextInt();

                if (len < 0) {
                    System.out.println("Входные данные неверные!");
                    return;
                }
                int[] mass = new int[len];
                int sum = 0;

                System.out.println("Введите элементы массива:");

                // Инициализация элементов массива
                for (int i = 0; i < len; i++) {
                    mass[i] = sc.nextInt();
                }

                int max = mass[0];
                int min = mass[0];

                System.out.println("\nВывод значений массива: ");

                // Ищем сумму эл-тов массива, максимальный, минимальный элемент
                int j = 0;

                while (j < len) {
                    sum += mass[j];
                    if (min > mass[j]) {
                        min = mass[j];
                    }
                    if (max < mass[j]) {
                        max = mass[j];
                    }
                    j++;
                }
//                                System.out.println("Максимальный элемент массива = " + max + "\n" +
//                                        "Минимальный элемент массива = " + min + "\n" +
//                                        "Cумма элементов массива = " + sum);

                System.out.printf("""
                        Максимальный элемент массива = %d%nМинимальный элемент массива = %d
                        Cумма элементов массива = %d
                        """, max, min, sum);

            } else {
                System.out.println("Входные данные неверные!");
            }
        }
    }
}
