package ObjectsAndConstructors;

public class Car {
    final String model;
    final String color;
    final int speed;
    final int volume;


   public Car(String model, String color, int speed, int volume) {
       this.model = model;
       this.color = color;
       this.speed = speed;
       this.volume = volume;
   }
    public static void main(String[] args) {
       Car Dodge = new Car("Caliber"," black",180, 52); /* конструктор с параметрами, сам
        напоминает какие параметры я должен внести, иначе не получится  */
        System.out.println("Dodge " + Dodge.model);
        System.out.println("Цвет: " + Dodge.color);
        System.out.println("Скорость: " +Dodge.speed);
        System.out.println("Обьем бензобака: " + Dodge.volume);
    }
}

/* Car Dodge  = new Car();
Рассмотрим порядок создания объекта. В этой строке выполняется три действия:

1-e,, задаётся переменная класса Car под именем Dodge.
      Эта переменная ещё не определяет объект, она просто даёт возможность ссылаться на него.
2-e, создаётся физическая копия объекта, а ссылка на него присваивается переменной Dodge.
      Это делается с помощью оператора new.
      Оператор new динамически — во время выполнения программы —
       выделяет память для объекта и возвращает ссылку на него,
       которая представляет собой адрес области памяти.
3-e, ссылка на объект сохраняется в переменной. За это отвечает оператор =.   */

