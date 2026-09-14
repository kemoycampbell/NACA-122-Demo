package gvt;

import java.util.concurrent.ConcurrentHashMap;

public class Mage 
{
    private final String name;
    private int currentHP;
    private int maximumHP;

    public Mage(String name)
    {
        this.name = name;
        this.currentHP = maximumHP = 120;
    }

    public Attack attack()
    {
        int[] hits = {9,9,9,9};
        String name = "Magic Missile";
        DamageType type = DamageType.MAGICAL;

        return new Attack(name, hits, type);
    }

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
            System.out.println(hit);
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

    public void heal(int amount)
    {
        int recover = currentHP + amount;
        if(recover > maximumHP)
            currentHP = maximumHP;
        else
            currentHP = recover;

    }

    public boolean isConscious()
    {
        return currentHP > 0;
    }

    @Override 
    public String toString()
    {
        return String.format("Goat:%s, Current HP:%d",name, currentHP);

    }

}
