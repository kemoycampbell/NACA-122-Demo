package binary_tree;

public class Main 
{
    public static void main(String args[])
    {
        // BinaryNode tree = new BinaryNode(2);
        // BinaryNode left = new BinaryNode(3);
        // BinaryNode right = new BinaryNode(7);
        // right.setRight(new BinaryNode(6));

        // //add to the tree
        // tree.setLeft(left);
        // tree.setRight(right);
        // System.out.println(tree);

        // System.out.print("infix traversal:");
        // System.out.println(tree.infixTraversal());

        // System.out.println("Searching:");

        // int[] searchItems = {
        //     1,2,3,4,5,6,7,8,9,10,11
        // };
        
        // for(int item: searchItems)
        // {
        //     System.out.println("Searching for:" + item);
        //     System.out.println("Res:" + tree.search(item));
        // }

        // NodeBST bst = new NodeBST();

        Pokedex pokedex = new Pokedex();

        int[] availablePokemons = {
            39,4,147,75
        };

        for(int pokemon: availablePokemons)
        {
            pokedex.addPokemon(pokemon);
        }

        System.out.println(pokedex);

        int[] pokemonsInTheWild = {
            1,2,3,4,5,6,7,8,9,10,11,39,4,147,75
        };

        for(int pokemon: pokemonsInTheWild){
            System.out.println("Searching for:" + pokemon);
            System.out.println("Res:" + pokedex.containsPokemon(pokemon));
        }
    }

    


}
