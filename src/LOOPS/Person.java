package LOOPS;

public class Person {
    public static void main(String[] args) {
        HUMAN human = new HUMAN("ggg", 88);
        System.out.println("Mеня зовут - " + human.getName()+ " и мне " + human.getAge() + " лет " );
       human.setName("Николай");
        human.setAge(7);
        System.out.println("Mеня зовут - " + human.getName()+ " и мне " + human.getAge() + " лет " );

    }
}
