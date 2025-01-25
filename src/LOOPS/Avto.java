package LOOPS;

public class Avto {

     private String name;
     private String color;

    public Avto(String name, String color) {
        this.name = name;
        this.color = color;
    }
    public static class Avia {
        void metod () {
            Avto Dodge = new Avto("Caliber", "RED");
            System.out.println(Dodge.name + " " + Dodge.color);



        }
    }

    public  static class Main {
        public static void main(String[] args) {
            Avia  exempl = new Avia();
            exempl.metod();

        }

    }
}

