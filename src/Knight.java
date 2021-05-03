public class Knight extends MOB {
    protected int id;
    protected int xp;
    private Fortune fortune;
    private String name;

    public Knight(int id, String name, int hp, int armor, int hitModifier, DiceType damageDie, int xp) {
        super(name,hp, armor, hitModifier, damageDie);
        this.id = id;
        this.xp = xp;
        this.name = name;

    }
    public void addXP(int xp) {
        this.xp += xp;
    }
    public int getXP() {
        return xp;
    }
    public Integer getId() {
        return id;
    }
    public void setActiveFortune(Fortune activeFortune) {
        this.fortune = activeFortune;
    }
    public Fortune getActiveFortune() {
        return fortune;
    }
    public String toCSV() {
        return "" + name + "," + maxHp + "," + armor + "," + hitModifier + "," +
                damageDie + "," + xp;
    }
    public static void main(String[] args) {
        Knight test = new Knight(0,"Sam", 40,16,2,DiceType.D8,0);
        System.out.println(test.toCSV());
    }
}
