package org.example.View;

import java.util.Scanner;
public class viewNew {
    public static int mainMenu() {
        Scanner sc = new Scanner(System.in);
        int answer = 0;
        int flag = 0;
        while (flag == 0) {
            System.out.println("Простой калькулятор.Выберите действие с числами : ");
            System.out.println("Меню:");
            System.out.println("1-Сложение");
            System.out.println("2-Умножение");
            System.out.println("3-Деление ");
            System.out.print("Пожалуйста выберите пункт меню ");
            answer = sc.nextInt();
            if (answer < 1 || answer > 3) {
                System.out.println("error");
            } else {
                flag = 1;
            }
        }
        return answer;

        }

    }
