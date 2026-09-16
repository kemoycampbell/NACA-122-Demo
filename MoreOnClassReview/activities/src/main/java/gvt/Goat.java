package gvt;

public abstract class Goat
{
    private final String name;
    protected int currentHP;
    private final int maximumHP;

    public Goat(String name, int maximumHP)
    {
        this.name = name;
        this.currentHP = this.maximumHP = maximumHP;
    }

    public abstract Attack attack();

    public abstract void takeDamage(Attack attack);

    public void heal(int amount)
    {
        int recover = currentHP + amount;
        //prevent having more hp than the maximum hp
        if(recover > maximumHP)
            currentHP = maximumHP;
        else
            currentHP = recover;

    }

    public String getName()
    {
        return this.name;
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
