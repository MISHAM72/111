package LOOPS;

import java.util.Scanner;                     // подключение к библиотеке





public class If_Else_UslovnyiAlgoritm {
    public static void main(String[] args) {  // метод по умолчанию
        Scanner sc = new Scanner(System.in);  // инициализация инструмента ввода
        System.out.println("Введите число:");
        int a;                 // чтение и сохранение в переменную введенного числа
        a = sc.nextInt();


    //  System.out.println((a > 0) ? "Ваше число положительное"
        //   : "Ваше число не положительное");


        if (a > 0) {                           // проверка условие

            System.out.println("Ваше число положительное"); //печать (если верно)

        } else System.out.println("Ваше число не положительное"); //печать (иначе)
    }
}