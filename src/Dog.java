/**
 * Created by Артем on 11.09.2016.
 */
public class Dog {
    int age;
    String name;
    boolean isMale;

    public Dog() {
    }

    public Dog(int age, String name, boolean isMale) {

        this.age = age;
        this.name = name;
        this.isMale = isMale;
    }

        void about(){
            System.out.printf("Имя %s,Возраст %d,Пол %s",name,age,isMale);

    }
    }

