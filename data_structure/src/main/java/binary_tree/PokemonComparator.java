package binary_tree;

import java.util.Comparator;

public class PokemonComparator implements Comparator<Pokemon>
{

    @Override
    public int compare(Pokemon pokemon1, Pokemon pokemon2) {
       return pokemon1.getName().toLowerCase().compareTo(pokemon2.getName());
    }

}
