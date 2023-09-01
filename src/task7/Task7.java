package task7;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Введите число: ");

            if (sc.hasNextInt()) {
                int input_value = sc.nextInt();
                if (input_value >= 0) {
                    fact(input_value);
//            System.out.printf("Факториал числа %d = %d", input_value, fact(input_value));
                } else {
                    System.out.println("Ошибка входных значений!");
                }
            }
        }
    }

    public static void fact(int value){
        if (value == 0){
            System.out.println(1);
        } else{
            int l = 1;
            for (int i = 1; i<=value;i++){
                l *= i;
            }
            System.out.println(l);
    }
    }}
