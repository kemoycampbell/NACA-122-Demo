package binary_tree;

import java.util.Comparator;

public class FruitComparator implements Comparator<Fruit>
{

    @Override
    public int compare(Fruit fruit1, Fruit fruit2) 
    {
        double price = fruit1.getPrice() - fruit2.getPrice();
        if(price < 0)
            return -1;
        if(price > 0)
            return 1;

        //both prices are the same so we compare by name
        return fruit1.getName().toLowerCase().compareTo(fruit2.getName().toLowerCase());
    }

}
