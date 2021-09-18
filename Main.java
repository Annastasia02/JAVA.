package Help.CatDog;

import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        Dog dogOne = new Dog("Бублик");
        dogOne.run(150);
        dogOne.swim(5);
        dogOne.swim(16);
        Cat cat1 = new Cat("Пушок");
        cat1.run(50);
        cat1.run(240);
        cat1.swim(10);
        Cat cat2 = new Cat("Саймон");
        Cat cat3 = new Cat("Нюша");

        System.out.println("Животные: " + Animal.getCount());
        System.out.println("Собаки: " + Dog.getCount());
        System.out.println("Кошки: " + Cat.getCount());

            }
        }



