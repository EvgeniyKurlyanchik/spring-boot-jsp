package com.company;

import java.util.Random;
import java.util.Scanner;

public class RPGGame {
    static String heroName;
   static int heroHP ;
   static int heroAttack ;
   static String monsterName ;
    static int monsterHP ;
   static int monsterAttack ;
    static Scanner sc;
    static Random random;

    public static void main(String[] args) {
        init();
        System.out.println("Игра началась");
        System.out.println("Герой" + heroName + "вошел в темный лес и видит пред собой монстра" + monsterName + " . Деваться некуда , вступаю в бой");
        System.out.println("Бой начался");

        while (true) {
            heroTurn();
            printStatistic();
            if (monsterHP<=0){
                System.out.println("Герой победил");
                break;
            }
            monsterTurn();
            printStatistic();
            if (heroHP<=0){
                System.out.println("Монстр победил");
                break;
            }
        }

        System.out.println("Игра закончилась");
    }
    public static void printStatistic(){
        System.out.println();
        System.out.println("Статистика");
        System.out.println("Герой " + heroName +"  HP "+ heroHP);
        System.out.println("Монстр " + monsterName + "   HP  " + monsterHP);
        System.out.println();
    }

    public static void init () {
        sc = new Scanner(System.in);
        random = new Random();
        System.out.println("Введите имя вашего героя");
        heroName = sc.next();
        heroHP=10;
        heroAttack=1;
        monsterName = "ОРК";
        monsterAttack =1;
        monsterHP =10;
    }

    public static void heroTurn () {
        System.out.println("Ход героя.Выберите действие  1. Атаковать . 2.Защищаться");


        int command = sc.nextInt();
        if (command == 1) {
            System.out.println("Монстр  " + monsterName + "  получил  " + heroAttack + "ед. урона");
            monsterHP -= heroAttack;

        } else if (command == 2) {
            System.out.println("Герой__   " + heroName + "решил защищатся и получил  1ед. здоровья");
            heroHP++;
        } else {
            System.out.println("Вы пропускаете ход...");
        }

    }

    public static void monsterTurn() {
        System.out.println("Ход монстра ");
        int monsterCommand = random.nextInt(2);
        if (monsterCommand == 0) {

            System.out.println("Монстр атакует. Герой " + heroName + "получил  " + monsterAttack + "ед. урона");
            heroHP -= monsterAttack;
        } else if (monsterCommand == 1) {

            System.out.println("Монстр решил отдохнуть и выпить  лекарство ");
            monsterHP += 5;

        }
    }
}
