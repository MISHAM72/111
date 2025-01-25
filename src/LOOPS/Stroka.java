package LOOPS;

public class Stroka {

    public static void main(String[] args) {
        StringBuilder word = new StringBuilder();
        for (char current = 'a'; current<= 'z' ; current++){
            word = word.append(current);
        }
        System.out.println(word);
    }
}
