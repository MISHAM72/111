package Methods;   //Метод replaceAll() возвращает новую строку,
// в которой все совпадения шаблона заменены на replacement.

public class ReplaceAll {
    public static void main(String[] args) {

     String message = "Я буду хорошим программистом";

// замена всех вхождений b на c
     String result = message.replaceAll("р", "л");
        System.out.println(result);
    }
}