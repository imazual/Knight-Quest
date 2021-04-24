import java.util.Random;

public class DiceSet {
    public int roll(DiceType diceType) {
        final Random rnd = new Random();
        int roll = 0;

        if (diceType == DiceType.D4) {
            roll = rnd.nextInt(4) + 1;
        }
        if (diceType == DiceType.D6) {
            roll = rnd.nextInt(6) + 1;
        }
        if (diceType == DiceType.D8) {
            roll = rnd.nextInt(8) + 1;
        }
        if (diceType == DiceType.D10) {
            roll = rnd.nextInt(10) + 1;
        }
        if (diceType == DiceType.D12) {
            roll = rnd.nextInt(12) + 1;
        }
        if (diceType == DiceType.D20) {
            roll = rnd.nextInt(20) + 1;
        }
        return roll;
    }
    public static void main(String[] args) {
        DiceSet myDice = new DiceSet();
        System.out.println("Testing Roll: D4 rolled - " + myDice.roll(DiceType.D4));
        System.out.println("Testing Roll: D4 rolled - " + myDice.roll(DiceType.D4));
        System.out.println("Testing Roll: D4 rolled - " + myDice.roll(DiceType.D4));
        System.out.println("Testing Roll: D6 rolled - " + myDice.roll(DiceType.D6));
        System.out.println("Testing Roll: D6 rolled - " + myDice.roll(DiceType.D6));
        System.out.println("Testing Roll: D6 rolled - " + myDice.roll(DiceType.D6));
        System.out.println("Testing Roll: D8 rolled - " + myDice.roll(DiceType.D8));
        System.out.println("Testing Roll: D8 rolled - " + myDice.roll(DiceType.D8));
        System.out.println("Testing Roll: D8 rolled - " + myDice.roll(DiceType.D8));
        System.out.println("Testing Roll: D10 rolled - " + myDice.roll(DiceType.D10));
        System.out.println("Testing Roll: D10 rolled - " + myDice.roll(DiceType.D10));
        System.out.println("Testing Roll: D10 rolled - " + myDice.roll(DiceType.D10));
        System.out.println("Testing Roll: D12 rolled - " + myDice.roll(DiceType.D12));
        System.out.println("Testing Roll: D12 rolled - " + myDice.roll(DiceType.D12));
        System.out.println("Testing Roll: D12 rolled - " + myDice.roll(DiceType.D12));
        System.out.println("Testing Roll: D20 rolled - " + myDice.roll(DiceType.D20));
        System.out.println("Testing Roll: D20 rolled - " + myDice.roll(DiceType.D20));
        System.out.println("Testing Roll: D20 rolled - " + myDice.roll(DiceType.D20));


    }
}
