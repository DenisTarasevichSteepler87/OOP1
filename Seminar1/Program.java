package Seminar1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Animal cat = new Animal("Барсик", LocalDate.of(2023, 03, 20), new Illness("лишай"));
        System.out.println(cat.getName());

        Animal dog = new Animal();
        System.out.println(dog.getName());

        cat.setIllness(new Illness("лишай"));
        System.out.println(cat.getIllness());

        Dog dog2 = new Dog("Шарик", LocalDate.of(2020, 5, 27), new Illness("глухота"));
        System.out.println(dog2.getType());

        Animal dog3 = new Dog("Бобик", LocalDate.of(2019, 8, 1), new Illness("привит"));
        System.out.println(dog3.illness);

        List<Animal> list = new ArrayList();
        list.add(dog3);
        list.add(cat);
        list.add(new Bird("Кеша", LocalDate.of(2023, 12, 31), new Illness("привит"), 2));
        System.out.println(list);

        // dog3.lifeCycle();

        Cat cat1 = new Cat("Мурка", LocalDate.of(2024, 1, 1), new Illness("рана на левой лапе"));
        Fish fish1 = new Fish("Окунь", LocalDate.of(2020, 12, 20), new Illness("соль"));
        Duck duck1 = new Duck("Кряк", LocalDate.of(2021, 9, 3), new Illness("привит"));
        Dolphin dolphin1 = new Dolphin("Нелси", LocalDate.of(2021, 8, 31), new Illness("привит"));

       cat1.toRun();
       cat1.toFly();
       cat1.toSwim();
       System.out.println();

       fish1.toRun();
       fish1.toFly();
       fish1.toSwim();
       System.out.println();

       duck1.toRun();
       duck1.toFly();
       duck1.toSwim();
       System.out.println();

       dolphin1.toRun();
       dolphin1.toFly();
       dolphin1.toSwim();
    }
}