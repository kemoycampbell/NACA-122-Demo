package pokemon;

public abstract class Pokemon 
{
    private final String name;
    private int level;
    private final PokemonType type;
    private int hp;

    public Pokemon(
        String name,
        int level,
        PokemonType type,
        int hp
    )
    {
        this.name = name;
        this.level = level;
        this.type = type;
        this.hp = hp;
    }

    public abstract Attack attack();

    public void displayInformation()
    {
        System.out.println(this.toString());
    }

    @Override 
    public String toString()
    {
        return String.format("Pokemon:%s, level:%d, type: %s, current hp: %d", name, level, type, hp);
    }

}
