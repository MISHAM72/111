package Methods;    //Строки в Java неизменяемы,
// Поэтому простого способа удалить символ из строки нет.
// Правильным подходом в этой ситуации будет создание новой строки на основе старой, в которой будет отсутствовать последний символ.
// Для этого можно использовать метод строк substring()

public class SubString {

    public static void main(String[] args) {

        String str = " Я буду хорошим программистом";
        String str2 = str.substring(0, str.length() - 1);
        System.out.println(str2);
    }
}