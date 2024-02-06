package Seminar1;

import java.time.LocalDate;

public class Cat extends Animal {
    public Cat(String name, LocalDate birthday, Illness illness) {
        super(name, birthday, illness);
    }
    public void toFly() {
        System.out.println(getType() + " не может летать!");
    }

    public void toSwim() {
        System.out.println(getType() + " не любит плавать!");
    }

}