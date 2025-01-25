package LOOPS;

public class Stroka2 {
    public static void main(String[] args) {
        String word = "привет";
        for (char current = 'a'; current<='z'; current++ ) {
            word = word + current;
        }
        System.out.println(word);
    }
}
