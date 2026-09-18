package gvt;

public abstract class Troll 
{
    private final String name;
    private final int maxHP;
    private int currentHP;

    public Troll(String name, int maxHP)
    {
        this.name = name;
        this.maxHP = this.currentHP = maxHP;
    }

    public abstract Attack attack();
    public abstract void takeDamage(Attack attack);
    public abstract void regenerate();

    public String getName()
    {
        return name;
    }

    public int getCurrentHP()
    {
        return currentHP;
    }

    public int getMaxHP()
    {
        return maxHP;
    }

    public boolean isVanquished()
    {
        return this.currentHP == 0;
    }

    protected void adjustHP(int amount)
    {
        this.currentHP = amount;
    }

}
