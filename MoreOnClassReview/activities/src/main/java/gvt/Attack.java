package gvt;

import java.util.Arrays;

public final class Attack {
    private final String name;
    private final int[] hits;
    private final DamageType damageType;

    public Attack(String name, int[] hits, DamageType damageType)
    {
        this.name = name;
        this.hits = hits;
        this.damageType = damageType;
    }

    public String getName()
    {
        return this.name;
    }

    public int[] getHits()
    {
        return this.hits;
    }

    public DamageType getDamageType()
    {
        return this.damageType;
    }

    @Override 
    public String toString()
    {
        return name + " (hits for " + Arrays.toString(hits) + " points of "
            + damageType + " damage)";        
    }

}
