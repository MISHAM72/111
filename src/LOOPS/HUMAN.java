package LOOPS;

public class HUMAN {


    private String name;
    private int age;

    // Конструктор с использованием сеттеров
   public HUMAN(String name, int age) {
         this.name = name;
        this.age = age;
   }

  /** public HUMAN(){}*/


    // Геттеры для доступа к полям
  public String getName(){
      return name;
  }
    public void setName(String name) {

            this.name = name;
        }

    // Геттеры для доступа к полям
    public int getAge() {
        return age;
    }

    // Сеттер для возраста
    public void setAge(int age) {
        if (age > 100 || age < 0)
        {System.out.println("Не задавай ебанутые значения , человек столько лет не живет " );
    }else{
        this.age = age;
       }
    }

    public static void main(String[] args) {
        /*
 Инициализация через конструктор с вызовом сеттеров
human.setName("БАБАЙ");
human.setName("ДЖОН");
*/
        HUMAN human = new HUMAN("ВАСИЛИЙ", 50);
        human.setName("БАБАЙ");
        human.setAge(99);
        // String name = human.getName();
        //int  age1= human.getAge();*/

       System.out.print("Меня зовут - " + human.name + " , и мне " + human.age + " лет , и я " +
               "говорю ");
    }
}