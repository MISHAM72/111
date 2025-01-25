package LOOPS;

import java.util.Scanner;

public class CATA_TextModifier1 {

 public static void main(String[] args) {textModifier1();}
  private static void textModifier1() {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Введите текст:");
      String text = scanner.nextLine();
      System.out.println("Читайте:");

      //----------------------------------------------------------------------------------------
       // Удаление лишних пробелов в тексте
      StringBuilder modifiedText = new StringBuilder();
      boolean spaceDetected = false;
        /*Переменные типа Boolean часто используются в условных операторах и циклах для
        управления потоком программы.*/
      for (int i = 0; i < text.length(); i++) { // это цикл для перебора всех символов в тексте,
         if (text.charAt(i) == ' ') {  //Если текущий символ = пробелу (text.charAt (i) == ' ')
             //нужно вытащить определенный символ в какой-то строке.
             // Как мы это можем сделать в Java?.. С помощью вызова метода Java String charAt
           if (!spaceDetected) {   // Если не обнаружено обнаружение пространства (spaceDetected == false)
               //(!spaceDetected) — это условие, которое проверяет, не обнаружено ли несколько пробелов подряд.
               // Если да, то добавляется только один пробел
               // можно использовать метод Character.isWhitespace().
                       // Он проверяет отдельные символы и возвращает true, если символ — пробел
            modifiedText.append(text.charAt(i)); }         /* то к изменяемой строке (StringBuilder)
                                                            добавляется текущий символ
                                                            (modifiedText.append(text.charAt(i))).*/
             spaceDetected = true;}                         // После этого spaceDetected
                                                            // становится true.
         else {
              modifiedText.append(text.charAt(i));
             spaceDetected = false;
         }
      }
                                                /*В противном случае  (если spaceDetected  == false)
                                                          к изменяемой строке  добавляется текущий
                                                        символ (modifiedText.append(text.charAt(i))
                                                                а spaceDetected становится false.*/


      // ---------------------------------------------------------------------------------------------
                  // Замена нами символов вокруг знака "-"
      StringBuilder swappedText = new StringBuilder();
      for (int i = 0; i < modifiedText.length(); i++) {
          if (modifiedText.charAt(i)== '-') {                 /*  В коде на Java означает, что
          символ слева от знака минус
                                                                         нужно поменять местами с символом, который стоит справа от этого знака.
                                                                          При этом символом может быть не только буква, но и цифра или любой другой знак/символ,
                                                                          в том числе символ пробела.
                                                                          После смены символов
                                                                          местами знак минус - нужно удалить из строки результата. */
              swappedText.deleteCharAt(swappedText.length() - 1);
              swappedText.append(modifiedText.charAt(i + 1));   /*Это строка которая добавляет в StringBuilder  swappedText символ,
                                                                         следующий за текущим (i + 1) в строке modifiedText*/
              swappedText.append(modifiedText.charAt(i - 1));    /*Это строка кода,
                                                                         которая добавляет в StringBuilder swappedText символ,

                                                                         стоящий в позиции i-1 в строке modifiedText.
                                                                            Она используется в методе textModifier для замены символов
                                                                            вокруг знака минус (-), если он присутствует в тексте.  */
              i++;
          } else {
              swappedText.append(modifiedText.charAt(i));   // это строка кода, которая добавляет символ из строки modifiedText в строку swappedText.
          }
      }
                     /* swappedText.deleteCharAt(swappedText.length() - 1) — это метод для удаления
                     последнего символа из StringBuilder в Java.
Метод length() возвращает длину строки, хранящейся в StringBuilder. Эта длина на единицу больше,
чем последний индекс символа в строке (так как индексация начинается с 0).
Поэтому из длины строки вычитается 1, чтобы получить индекс последнего символа.
Например, в коде на GitHub для удаления символа вокруг знака минус (если он есть) используется
следующий код:if (modifiedText.charAt(i) == '-') */
   // ------------------------------------------------------------------------------------------
      //Заменим "+" на "!"
      String  replacedText = swappedText.toString().replace("+", "!");
      System.out.println("Измененный текст:" + modifiedText);
      //----------------------------------------------------------------------------------------------
       // Вычисление суммы цифр и их удаление
      int sum = 0;
           StringBuilder finalTEXT  = new StringBuilder();
          for (int i = 0; i < replacedText.length(); i ++) {
          char c = replacedText.charAt(i);
          if (Character.isDigit(c)) {
          sum += Character.getNumericValue(c);
          } else {
            finalTEXT.append(c);
             }
           }
           finalTEXT.append(" ").append(sum);
            System.out.println("Измененный текст:" + finalTEXT);
        //--------------------------------------------------------------------------------------------
           scanner.close();
         }
      }
/*  StringBuilder в Java — это класс для создания изменяемой последовательности символов.
Он предназначен для динамической манипуляции со строками, например,
для построения строк из множества маленьких строк или добавления новых символов к существующей строке.
   Использование StringBuilder имеет смысл при работе с большим количеством строк или в циклах,
где происходит множественное объединение строк.
 Вместо создания, новых объектов строк при каждой конкатенации, StringBuilder модифицирует
 существующую строку, что является более эффективным подходом.*/
