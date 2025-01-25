package ObjectsAndConstructors;

public class Car2 {
    String model;
    String color;
    int speed;
    int volume;



    public static void main(String[] args) {
        Car2 Dodge = new Car2();
        Dodge.model = "Dodge Caliber";
        Dodge.color = "Black";
        Dodge.speed = 180;
        Dodge.volume = 51;
        System.out.println("авто: " + Dodge.model +  ",  Цвет: " + Dodge.color );
/* забыл указать 2 параметра и прокатило в этом конструкторе (без параметров) */
    }
}
