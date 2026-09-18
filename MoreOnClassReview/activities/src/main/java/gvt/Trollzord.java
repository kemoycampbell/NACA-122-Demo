package gvt;

public class Trollzord extends Troll
{
    private static final String NAME = "Trollzord";
    private static final int MAX_HP = 64;
    private static double REGEN_AMOUNT = 0.05;

    public Trollzord()
    {
        super(NAME, MAX_HP);
    }
    @Override
    public Attack attack() {
        int hits[] = new int[]{25};
        return new Attack("Flame War", hits, DamageType.MAGICAL);
    }
    @Override
    public void takeDamage(Attack attack) {
        double percent = 1.0;
        if(attack.getDamageType() == DamageType.HOLY){
            percent+=.25;
        }

        int amount = 0;
        for(int hit: attack.getHits()){
            amount+= hit * percent;
        }

        int newHealthPoint = this.getCurrentHP() - amount;
        this.adjustHP(newHealthPoint);


    }
    @Override
    public void regenerate() {
        if(this.isVanquished())
            return ;


        int recovery = (int)(MAX_HP * REGEN_AMOUNT);
        int healthPoint = this.getCurrentHP() + recovery;
        this.adjustHP(healthPoint);
    }

}
