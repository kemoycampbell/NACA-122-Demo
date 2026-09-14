package gvt;

public class Battle 
{

    public static void main(String args[])
    {
        //setup the warriors
        Mage mage = new Mage("Michael");
        Fighter fighter = new Fighter("Kemoy");

        //battle log

        System.out.println("Kemoy and Michael Battling!");
        System.out.println("Michael Launching attack against Kemoy");
        Attack magic = mage.attack();
        System.out.println(magic);
        fighter.takeDamage(magic);
        System.out.println(fighter);

        System.out.println("Kemoy launching the ultimate counterattack!!!");
        Attack cleave = fighter.attack();
        System.out.println(cleave);
        mage.takeDamage(cleave);
        System.out.println(mage);






    }

}
