package pokemon;

public class Attack 
{
    private final String name;

    public Attack(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    @Override 
    public String toString()
    {
        return this.name;
    }

}
