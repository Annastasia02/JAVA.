package Help.CatDog;

abstract class Animal {
    private static int count = 0;
    String name;
    abstract void run(int distance);
    abstract void swim(int distance);

    static int getCount(){
        return count;}
    Animal(){
        count ++;
    }
        }
