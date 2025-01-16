package LOOPS;

import java.util.Scanner;
public class A_bolyshe_ili_B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите 1-е число:");
        int a = sc.nextInt();
        System.out.println("ииедите 2-е число:");
        int b = sc.nextInt();
       // int sum = a +b ;
       // System.out.println("сумма чисел:" + sum);
        if (a>b){
        System.out.println(" число (a) больше числа (b)");
        }else if (a<b) {
            System.out.println(" число (a) меньше числа (b)");
        }else {
            System.out.println("числа равны");
        }
    }
}







// Необходимо написать метод, который принимает два числа в качестве
// аргументов и возвращает строку с информацией о том, какое число больше - первое,
// второе или они равны.

// Затем в main считать из консоли два числа от пользователя и вызвать метод
// с этими значениями и вывести результат в консоль.


