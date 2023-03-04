package com.company;

import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//       System.out.println("Input first number");
//        int a = sc.nextInt();
//        System.out.println("Input second number");
//        int b = sc.nextInt();
//
//        System.out.println("Input next operation( + , - , *, / ) ");
//        char  operation  = sc.next().charAt(0);
//
//        if (operation == '+'){
//          int result = a+b ;
//            System.out.println( "Сумма чисел равна  " + result);
//        }
//        if (operation == '-'){
//            int result = a -b ;
//            System.out.println(  a +"-"+ b+"=" + result);
//        }
//        if (operation == '*'){
//            int result = a *  b ;
//            System.out.println(  a +"*"+ b+"=" + result);
//        }
//        if (operation == '/'){
//            int result = a /  b ;
//            System.out.println(  a +"/"+ b+"=" + result);
//        }

       System.out.println("Input first number");
       float a = sc.nextFloat();
        System.out.println("Input next operation( + , - , *, / ) ");
        char  operation  = sc.next().charAt(0);
        System.out.println("Input second number");
        float b = sc.nextFloat();
        if (operation == '+'){
          float result = a+b ;
            System.out.println( "Сумма чисел равна  " + result);
        } else if (operation == '-') {
            float result = a -b ;
            System.out.println(  a +"-"+ b+"=" + result);
        }

       else if (operation == '*'){
            float result = a *  b ;
            System.out.println(  a +"*"+ b+"=" + result);
        }
        else if(operation == '/'){
            float result = a /  b ;
            System.out.println(  a +"/"+ b+"=" + result);
        } else {
            System.out.println("Указанная операция не поддерживается");}

    }
}
