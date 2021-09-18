package Help.CatDog;

class Dog extends Animal {
    static int MaxRun = 500;
    static int MaxSwim = 10;
    static int count = 0;
    static int getCount(){
    return count;
}

    Dog(String name) {
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
    void swim(int distance) {
        if (distance < MaxSwim) {
            System.out.println(name + " проплыл: " + distance + " метров ");
        } else {
            System.out.println(name + " не смог проплыть " + distance + " метров ");
        }
    }
}


