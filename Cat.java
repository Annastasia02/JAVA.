package Help.CatDog;

class Cat extends Animal {
    static int MaxRun = 200;
    static int count = 0;
    static int getCount(){
        return count;
    }

    Cat(String name){
        this.name = name;
        count++;
    }
    @Override
    void run(int distance) {
        if (distance < MaxRun) {
            System.out.println(name + " пробежал: " + distance + " метров ");
        } else {
            System.out.println(name + " не смог пробежать " + distance + " метров ");
        }
    }
    @Override
    void swim(int distance){
        System.out.println(name + " не хочет плавать :) ");
    }
}

