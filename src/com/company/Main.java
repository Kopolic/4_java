package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int value;
        Scanner number = new Scanner(System.in);
        System.out.println("Введите четное число:");
        if(number.hasNextInt()){
            do{
                value = number.nextInt();
                if(value % 2 != 0 || value < 1)System.out.println("Вы ошиблись, введите повторно четное число!");
            }
            while(value % 2 != 0 || value < 1);
            int[] array = new int[value];
            for (int i = 0; i < value; i++) {

                array[i] = (int)((Math.random() * 12) - 6);
                System.out.print(array[i] + " ");
            }
        }
    }
}
