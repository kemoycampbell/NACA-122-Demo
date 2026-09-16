package gvt;

public class GoatArena {

    public static void battle(Goat goat1, Goat goat2)
    {
        int round = 1;
        
        while(goat1.isConscious() && goat2.isConscious())
        {
            System.out.println("Round: " + round);

            System.out.println(goat1);
            Attack attack = goat1.attack();
            System.out.println(String.format("%s attacking %s with %s", goat1.getName(), goat2.getName(), attack));
            goat2.takeDamage(attack);


            System.out.println(goat2);
            attack = goat2.attack();
            System.out.println(String.format("%s attacking %s with %s", goat2.getName(), goat1.getName(), attack));
    
            goat1.takeDamage(attack);

            round++;
        }

        //winners
        System.out.println("Winner:");
        if(!goat1.isConscious() && !goat2.isConscious()){
            System.out.println("The battle ends in a draw");
        } else if(goat1.isConscious() && !goat2.isConscious()){
            
            System.out.println(goat1);
        } else {

            System.out.println(goat2);
        }


    }

    public static void main(String args[])
    {
        Goat goat1 = new Mage("Michael");
        Goat goat2 = new Fighter("Kemoy");

        battle(goat1, goat2);


        goat1 = new Mage("Ahmad");
        goat2 = new Mage("Nathan");

        battle(goat1, goat2);

        
    }

   
}
