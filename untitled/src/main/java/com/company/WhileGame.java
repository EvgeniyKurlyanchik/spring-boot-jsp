package com.company;

import java.util.Random;
import java.util.Scanner;

public class WhileGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int  aiNumber = random.nextInt(10);
        System.out.println("Компьютер загадал число,от 0 до 9");
        while (true) {
            System.out.println("Угадай число ");
            int answer = sc.nextInt();

            if (answer == aiNumber) {
                System.out.println("Угадали");
                break;
            } else {
                System.out.println("Не угадали");
            }

        }

    }
}
