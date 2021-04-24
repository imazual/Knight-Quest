public class MOB implements Attributes{
    protected String name;
    protected int hp;
    protected int armor;
    protected int hitModifier;
    protected DiceType damageDie;

    public MOB(String name, int hp, int armor, int hitModifier, DiceType damageDie) {
        //this.name = name;
        this.hp = hp;
        this.armor = armor;
        this.hitModifier = hitModifier;
        this.damageDie = damageDie;
    }

    public String getName(String name) {
        return name;
    }
    public int getHp (int hp) {
        return hp;
    }

    @Override
    public int getArmor() {
        return 0;
    }

    @Override
    public int getMaxHP() {
        return 0;
    }

    @Override
    public DiceType getDamageDie() {
        return null;
    }

    @Override
    public int getHitModifier() {
        return 0;
    }
}
