package com.company.game;

import java.util.Scanner;

public class Game {

    public int numberStart = 1;
    public int numberFinish = 5;
    public int myNumber;
    public boolean game = true;
    public int myScore = 0;
    public int pcScore = 0;
    // Scanner scanner = new Scanner(System.in);

    public void game() {
        System.out.println("Здравствуйте, добро пожаловать в игру.");
        System.out.println("Для выхода из игры введите 0.");

        while (game == true) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Пожалуйста, загадайте число от " + numberStart + " до " + numberFinish + ".");
            myNumber = scanner.nextInt();

            if (myNumber < 0 || myNumber > 5){
                System.out.println("Вы вышли за пределы допустимого диапазона.");
            } else {
                if (myNumber != 0) {
                    System.out.println("Вы ввели число " + myNumber);
                }

                int random_number = numberStart + (int) (Math.random() * numberFinish); // Генерация числа
                if (myNumber != 0){
                    System.out.println("Компьютер пытается угадать и думает, что это число: " + random_number);
                }

                if (myNumber != 0) {
                    myScore++;
                }


                if (myNumber == random_number) {
                    pcScore++;
                }

                if (myNumber == 0) {
                    game = false;
                    System.out.println("GG WP!");
                }
            }
            }

        System.out.println("Количество выстрелов - " + myScore);
        System.out.println("Попаданий - " + pcScore);
    }

}
