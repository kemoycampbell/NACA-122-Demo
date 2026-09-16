package gvt;


public class Mage extends Goat
{
    private static final int MAXIMUM_HP = 120;

    public Mage(String name)
    {
        super(name, MAXIMUM_HP);
   
    }

    @Override 
    public Attack attack()
    {
        int[] hits = {9,9,9,9};
        String name = "Magic Missile";
        DamageType type = DamageType.MAGICAL;

        return new Attack(name, hits, type);
    }

    @Override 
    public void takeDamage(Attack attack)
    {
        double damagePercent = 1.0; //100%
        
        if(attack.getDamageType() == DamageType.MAGICAL){
            damagePercent = reduceMagicalDamageBy25Percent();
        } else if(attack.getDamageType() == DamageType.PHYSICAL) {
            damagePercent = increasePhysicalDamageBy25Percent();
        }

        double damageAmount = 0;
        // System.out.println("Damage percent:" + damagePercent);
        for(int hit: attack.getHits()){
            damageAmount+= (hit * damagePercent);
        }

        // System.out.println("Damage amount:" + damageAmount);

        this.reduceHP((int)damageAmount);

    }

    private double reduceMagicalDamageBy25Percent()
    {
        return 0.75;
    }

    private double increasePhysicalDamageBy25Percent()
    {
        return 1.25;
    }

    private void reduceHP(int amount)
    {
        if(currentHP == 0)
            return ;


        currentHP-=amount;

        //hp cannot be negative
        if(currentHP < 0){
            currentHP = 0;
            return;
        }
            
    }

}
