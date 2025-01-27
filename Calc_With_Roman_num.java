package LOOPS;
import java.util.Scanner;
class Calc_With_Roman_num {
      
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("введите первое число -  ");
            int first = sc.nextInt();
            System.out.println("введите второе число - ");
            int sec = sc.nextInt();
            System.out.println(" укажите знак - ");
            String znak = sc.next();
          
            int itogo = Acalc(znak, first, sec);
             String roman = Roman(itogo);
            System.out.println(roman);
            System.out.println(" это ответ в римских числах -  ");
            System.out.println(" и   это  полное решение задачки ");
           
      }
      public static int Acalc(String opera, int n1, int n2) {
            int result = 0;
            //Write the calulator
            
            if (opera.equals("+")) {result = n1+n2;}
            if (opera.equals("-")) {result = n1 - n2;}
            if (opera.equals("*")) {result = n1 * n2;}
            if (opera.equals("/")) {result = n1 / n2;}
            System.out.println(result);
            return result;
      }
      
      public static String Roman(double input) {
            
            String s = "";
            
            
                  if (input < 1 || input > 999)
                        System.out.println("negative roman numeral value ");
                  
            
                  while (input >= 100) {
                        s += "C";
                        input -= 100;
                  }
                  while (input >= 90) {
                        s += "XC";
                        input -= 90;
                  }
                  while (input >= 50) {
                        s += "L";
                        input -= 50;
                  }
                  while (input >= 40) {
                        s += "XL";
                        input -= 40;
                  }
                  while (input >= 10) {
                        s += "X";
                        input -= 10;
                  }
                  while (input >= 9) {
                        s += "IX";
                        input -= 9;
                  }
                  while (input >= 5) {
                        s += "V";
                        input -= 5;
                  }
                  while (input >= 4) {
                        s += "IV";
                        input -= 4;
                  }
                  while (input >= 1) {
                        s += "I";
                        input -= 1;
                  }
                  return s;
            }
      }
