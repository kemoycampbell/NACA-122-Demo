package binary_tree;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class PokemonMain 
{
    public static void main(String args[])
    {
        List<Pokemon> pokemons = new LinkedList<Pokemon>();
        pokemons.add(new Pokemon(50, "A"));
        pokemons.add(new Pokemon(2, "C"));
        pokemons.add(new Pokemon(5, "D"));


        //using the comparable
        // System.out.println("Using comparable");
        // Collections.sort(pokemons);
        // pokemons.forEach(System.out::println);

        //using the comparator
        System.out.println("\nUsing Comparator");
        PokemonComparator comparator = new PokemonComparator();
        Collections.sort(pokemons, comparator);
        pokemons.forEach(System.out::println);
    }
    
}
