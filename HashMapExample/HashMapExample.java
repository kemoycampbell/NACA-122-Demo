import java.util.Map;
import java.util.HashMap;

void main()
{
    Map<String, Integer> dogs = new HashMap<>();
    dogs.put("Buttercup", 10);
    dogs.put("Flash", 8);
    dogs.put("Rex", 2);
    dogs.put("Captain Fluffypants", 1);
    
    for(String dog : dogs.keySet()) {
        System.out.println(dog + " is " + dogs.get(dog));
    }

}