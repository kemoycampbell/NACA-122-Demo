package binary_tree;

public class Pokemon //implements Comparable<Pokemon> 
{
    private final int number;
    private String name;

    public Pokemon(int number, String name)
    {
        this.number = number;
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    // @Override 
    // public int compareTo(Pokemon other)
    // {
    //     return this.number - other.number;
    // }

    @Override 
    public String toString()
    {
        return this.number +":"+this.name;
    }
}
