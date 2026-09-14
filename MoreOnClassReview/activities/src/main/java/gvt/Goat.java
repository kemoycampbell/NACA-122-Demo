package gvt;

public abstract class Goat
{
    private final String name;
    private int currentHP;
    private final int maximumHP;

    public Goat(String name)
    {
        this.name = name;
        this.currentHP = maximumHP = 120;
    }

    public abstract Attack attack();

    public abstract void takeDamage(Attack attack);

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
