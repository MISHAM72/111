package LOOPS;

import java.util.Scanner;

public class Cycle_Do_While_Algorithm {
    public static void main(String[] args) {
     int z = 0;
     do {System.out.print(" ваше число:" + z);
         z++;}
     while (z < 10);
    }
}
/*  В целом, do-while нужен, когда необходимо выполнить фрагмент минимум единожды.
 While нужен тогда, когда лучше применить блок кода только при булевом выражении «True».  */