import java.util.Random;

public class Dice {
    private int sides;

    public Dice(){}
    public Dice(int sides) {
        this.sides = sides;
    }

    public int getSides() {
        return this.sides;
    }

    public void setSides(int side) {
        this.sides = side;
    }

    public int roll() {
        Random rand = new Random();
        int sides = rand.nextInt(this.sides) + 1;  // 1 till this side
        return sides;

    }
}
