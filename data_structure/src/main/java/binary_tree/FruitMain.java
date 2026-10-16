package binary_tree;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class FruitMain 
{
    public static void main(String args[])
    {
        //Fruit mango = new Fruit("Mango", 2.50);
        List<Fruit> fruits = new LinkedList<>();
        fruits.add(new Fruit("Peach", 2.25));
        fruits.add(new Fruit("Apple", 2.0));
        fruits.add(new Fruit("Mango", 3.75));
        fruits.add(new Fruit("Plum", 1.50));
        fruits.add(new Fruit("Banana", 1.0));
        fruits.add(new Fruit("Mango", 2.50));

        System.out.println("Comparing by comparable");
        Collections.sort(fruits);
        fruits.forEach(System.out::println);

        System.out.println("\nComparing comparator");
        FruitComparator comparator = new FruitComparator();
        Collections.sort(fruits, comparator);
        fruits.forEach(System.out::println);
    }
}
