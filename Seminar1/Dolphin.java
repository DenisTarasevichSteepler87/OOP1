package Seminar1;

import java.time.LocalDate;

public class Dolphin extends Animal {
    public Dolphin(String name, LocalDate birthday, Illness illness) {
        super(name, birthday, illness);
    }

    public void toRun() {
        System.out.println(getType() + " не может бегать!");
    }

    public void toFly() {
        System.out.println(getType() + " не может летать!");
    }
}