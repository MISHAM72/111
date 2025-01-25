package ObjectsAndConstructors;

import LOOPS.HUMAN;


 public class Car3 {
        String name;
        String color;

        public Car3(){
        }
        public Car3(String name, String color){
            this.name = name;
            this.color = color;
        }


public  static class Objects {
    void fool() {
        Car3 LADA = new Car3("Kalina", "Black");
        System.out.println(LADA.name + " " + LADA.color);
        // Car3 Dodge = new Car3();
        //Dodge.name = "Caliber";
        //Dodge.color = "Black";
        // System.out.println(Dodge.name + " " + Dodge.color);
    }
}
public  class Main {  //  здесь создаем экземпляр класса и обращаемся к его методу
    public static void main(String[] args) {
        HUMAN human = new HUMAN("rrr", 95);
       // human.setName("Федя");
       // human.setAge(68);
      // String hN = human.getName();
       //int hA = human.getAge();
       // System.out.println("имя кота - "+ hN);
        //System.out.println("ему - " + hA);
        System.out.println("Я " + human.getName() + " мне " + human.getAge() + " лет.");


        Objects constructor = new Objects();   //надо сделать экземпляр нашего класса
        constructor.fool(); // надо обратиться к его методу

    }
  }
}

