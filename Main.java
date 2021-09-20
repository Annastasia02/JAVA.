package CatEatFood;

public class Main {

    public static void main(String[] args) {
        Cat[] catPack = new Cat[]{
                new Cat("Басик", 5),
                new Cat("Пушистик", 4),
                new Cat("Соня", 7),
                new Cat("Саймон", 8),
                new Cat("Кузя", 6),
        };
        Plate plate = new Plate(20);

        plate.info();

        for (Cat cat : catPack) {
            cat.eat(plate);
        }
        plate.info();

        for (Cat cat : catPack) {
            System.out.println("Котик " + cat.getName() + " сытый -  " + cat.isFullness());
        }
        plate.increaseFood(20);
        plate.info();
        catPack[1].eat(plate);
        catPack[3].eat(plate);

        System.out.println("Котик " + catPack[1].getName() + "сытый - " + catPack[1].isFullness());
        System.out.println("Котик " + catPack[3].getName() + "сытый - " + catPack[3].isFullness());
    }
}