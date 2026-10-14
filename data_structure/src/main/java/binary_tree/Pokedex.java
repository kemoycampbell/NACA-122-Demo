package binary_tree;

public class Pokedex 
{
    private BinarySearchTree bst;
    

    public Pokedex()
    {
        this.bst = new NodeBST();
    }

    public void addPokemon(int number)
    {
        this.bst.insert(number);
    }

    public boolean containsPokemon(int number)
    {
        return this.bst.search(number);
    }

    @Override 
    public String toString()
    {
        return this.bst.toString();
    }
}
