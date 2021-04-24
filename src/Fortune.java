public class Fortune implements Attributes {
    protected String name;
    protected int hpBonus;
    protected int armor;
    protected int hitModifier;
    DiceType type;

    public Fortune(String name, int hpBonus, int armor, int hitModifier) {
        this.name = name;
        this.hpBonus = hpBonus;
        this.armor = armor;
        this.hitModifier = hitModifier;

    }
    public Fortune(String name, int hpBonus, int armor, int hitModifier, DiceType type) {
        this.name = name;
        this.hpBonus = hpBonus;
        this.armor = armor;
        this.hitModifier = hitModifier;
        this.type = type;
    }

    @Override
    public int getArmor() {
        return armor;
    }

    @Override
    public DiceType getDamageDie() {
        return type;
    }

    @Override
    public int getHitModifier() {
        return hitModifier;
    }

    @Override
    public int getMaxHP() {
        return hpBonus;
    }

    public String getName() {
        return name;
    }


//    TODO: Finish toString()

    public String toString() {
        return "+======================+\n" +
                String.format("|%-22s|\n", getName()) +
                String.format("|HP Bonus:%12s|\n", getMaxHP());



        /*return "+============================+\n" +
                String.format("| %-27s|%n", getName()) +
                "|                            |\n" +
                String.format("| Health: %-5d   XP: %-6d |%n", getRemainingHealth(), getXp())  +
                String.format("|  Power: %-6d  Armor: %-4d|%n", getPower(), getArmor()) +
                "|                            |\n" +
                "+============================+\n";*/
    }
    public static void main(String[] args) {
        Fortune test = new Fortune("Nobility", 10, 1, 1);
        System.out.println(test.toString());
    }
}
