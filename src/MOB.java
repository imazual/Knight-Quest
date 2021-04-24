public class MOB implements Attributes{
    protected String name;
    protected int maxHp;
    protected int armor;
    protected int hitModifier;
    protected DiceType damageDie;
    protected int damage;

    // Default constructor for MOB
    public MOB(String name, int hp, int armor, int hitModifier, DiceType damageDie) {
        //this.name = name;
        this.maxHp = hp;
        this.armor = armor;
        this.hitModifier = hitModifier;
        this.damageDie = damageDie;
    }

    public String getName() {
        return name;
    }
    public int getHp () {
        return maxHp;
    }

    public void addDamage(int damage) {
        this.damage += damage;
    }

    public void resetDamage() {
        this.damage = 0;
    }

    public MOB copy(){
        return new MOB(this.name, this.maxHp, this.armor, this.hitModifier, this.damageDie);
    }


// Overrides for Attributes inheritance
    @Override
    public int getArmor() {
        return armor;
    }

    @Override
    public int getMaxHP() {
        return maxHp;
    }

    @Override
    public DiceType getDamageDie() {
        return damageDie;
    }

    @Override
    public int getHitModifier() {
        return hitModifier;
    }
}
