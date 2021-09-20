package CatEatFood;

    public class Plate {
        private int food;

        public Plate(int Food){
            this.food = Math.max(food,0);
            }
        public boolean decreaseFood (int n){
            if (food - n >= 0) {
                food  -= n;
                return true;
            }
            return false;
        }
        public void info() {
            System.out.println("plate: " + food);
        }
        public void increaseFood(int n){
            if (n > 0){
                food  += n;
            }
        }
    }

