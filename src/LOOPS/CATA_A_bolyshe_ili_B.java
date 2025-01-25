package LOOPS;

import java.util.Scanner;

public class CATA_A_bolyshe_ili_B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите первое число:");
        int a = sc.nextInt();
        System.out.println("введите второе число -");
        int b = sc.nextInt();

        if (a > b) { System.out.println(" первое число больше");}
        else { if (a < b) { System.out.println("второе число больше");}
        else { System.out.println("числа равны");}}
    }
}

    /* public static void num (int a, int b) {
     if (a < b) {System.out.println("b больше ,чем a");}
      else if (a > b) {System.out.println("a больше ,чем b");}
       else {System.out.println("числа равны"); }}*/








// Необходимо написать метод, который принимает два числа в качестве
// аргументов и возвращает строку с информацией о том, какое число больше - первое,
// второе или они равны.

// Затем в main считать из консоли два числа от пользователя и вызвать метод
// с этими значениями и вывести результат в консоль.


