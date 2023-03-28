package org.example.Controler;
import org.example.Model.Log;
import org.example.Model.model;
import org.example.View.viewNew;

import java.util.Scanner;


public class Controler {
    public void init(){
        viewNew cv = new viewNew();
        model <Integer> model = new model<>();
        Log  logger = new Log();
        int answer = 1;
        while (answer != 5){
            answer = cv.mainMenu();
            System.out.println("Введите первое число");
            Scanner in2 = new Scanner(System.in);
            int num1 = in2.nextInt();
            System.out.println("Введите второе число");
            Scanner in3 = new Scanner(System.in);
            int num2 = in3.nextInt();
            switch (answer){
                case 1:
                    System.out.println("Результат сложения = "+model.sum(num1,num2));
                    Log.sort(model.sum(num1,num2));
                    break;
                case 2:
                    System.out.println("Результат умножения = "+model.multiplication(num1,num2));
                    Log.sort(model.multiplication(num1,num2));
                    break;
                case 3:
                    System.out.println("Результат деления = "+model.del(num1,num2));
                    Log.sort(model.del(num1,num2));
                    break;

            }
        }
    }

}