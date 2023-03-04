package com.company;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

//3 сканер
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Input first number");
//        int a = sc.nextInt();
//        System.out.println("Input second number");
//        int b = sc.nextInt();
//
//        int sum= a+b;
//
//        System.out.println(" Сумма  чисел " + a+" и" + b + "равна " + sum);


// Примитивы
        int age = 20;
        System.out.println(age);
        short num1 = 2;
        System.out.println(num1);
        byte b = 12;
        System.out.println(b);
        long l = 12L;
        System.out.println(l);
        float f = 20.13f;
        System.out.println(f);
        double d = 12.212345;
        System.out.println(d);
        boolean boo = true;
        System.out.println(boo);
        char ch= 'A';
        System.out.println(ch);
        String str = "выше были примитвные типы данных,String ссылочный тип ";
        System.out.println(str);

// операции

//        age +=5;
//        System.out.println("age = " + age);
//        age -=2;
//        System.out.println("age = " + age);
//        age *=2;
//        System.out.println("age = " + age);
//        age /=3;
//        System.out.println("age = " + age);
//
//        age++;
//        age++;
//        System.out.println("age = " + age);


//условия
        Scanner sc = new Scanner(System.in);
        System.out.println("Input first number");
        int a = sc.nextInt();
        if (a>=0){
            System.out.println("Вы ввели положительное число");

        }
        else{
            System.out.println("Вы ввели отрицательное число");
        }
        System.out.println("Введите второе число");
        int sec = sc.nextInt();

        if (sec!=0){
            System.out.println(" красавчик");
        } else {
            System.out.println("не красавчик");}


    }
}
