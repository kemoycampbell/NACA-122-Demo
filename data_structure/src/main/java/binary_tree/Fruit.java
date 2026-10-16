package binary_tree;

public class Fruit implements Comparable<Fruit>
{
    private final String name;
    private final double price;

    public Fruit(String name, double price)
    {
        this.name = name;
        this.price = price;
    }

    @Override 
    public String toString()
    {
        return String.format("%s $%,.2f", name, price);
    }

    public String getName()
    {
        return this.name;
    }

    public double getPrice()
    {
        return this.price;
    }

    @Override
    public int compareTo(Fruit other) {
        
        //if the fruits are not the same then we just return the result
        int sameFruit = this.name.toLowerCase().compareTo(other.getName().toLowerCase());
        if(sameFruit != 0){
            return sameFruit;
        }

        //compare by price if two fruits are the same
        double res = (this.price - other.price);
        if(res < 0)
            return -1;
        if(res > 0)
            return 1;
        
        return 0;
    }

}
