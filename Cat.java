package CatEatFood;

import org.jetbrains.annotations.NotNull;

public class Cat{
    private final String name;
    private final int appetite;
    private boolean fullness;

    public Cat(String name,int appetite){
        this.name = name;
        this.appetite = appetite;
        fullness = false;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean isFullness() {
        return fullness;
    }
    public void eat(Plate p) {
        if (p.decreaseFood(appetite)){
            fullness = true;
        }
    }
}