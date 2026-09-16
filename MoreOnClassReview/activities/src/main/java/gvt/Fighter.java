package gvt;



public class Fighter extends Goat
{
    private static final int MAXIMUM_HP = 150;

    public Fighter(String name)
    {
        super(name, MAXIMUM_HP);
    }

    @Override 
    public Attack attack()
    {
        int[] hits = {25};
        String name = "Cleave";
        DamageType type = DamageType.PHYSICAL;

        return new Attack(name, hits, type);
    }

    @Override 
    public void takeDamage(Attack attack)
    {
        double damagePercent = 1.0; //100%
        
        if(attack.getDamageType() == DamageType.MAGICAL){
            damagePercent = increasePhysicalDamageBy25Percent();
        } else if(attack.getDamageType() == DamageType.PHYSICAL) {
            damagePercent = reduceMagicalDamageBy25Percent();
        }

        double damageAmount = 0;
        for(int hit: attack.getHits()){
            damageAmount+= (hit * damagePercent);
        }

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
