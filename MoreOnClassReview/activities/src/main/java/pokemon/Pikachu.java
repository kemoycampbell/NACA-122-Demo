package pokemon;

public class Pikachu extends Pokemon 
{

    public Pikachu(String name, int hp, int level)
    {
        super(name, level, PokemonType.ELECTRIC, hp);
    }

    @Override 
    public Attack attack()
    {
        return new Attack("Thunderbolt");
    }

}
