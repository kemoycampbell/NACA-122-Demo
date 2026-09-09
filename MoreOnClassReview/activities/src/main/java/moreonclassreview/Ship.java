package moreonclassreview;

public class Ship 
{
    private String name;
    private int size;
    private Speed speed;

    public Ship()
    {
        // this.size = 0;
        // this.speed = 0;

        this("Unassigned",0,Speed.SLOW);
    }

    public Ship(String name,int size, Speed speed)
    {
        this.name = name;
        this.size = size;
        this.speed = speed;
    }

    @Override 
    public String toString()
    {
        return String.format("Ship:%s\nSize:%d\nSpeed:%d", name, size, speed);
    }

    @Override 
    public boolean equals(Object obj)
    {

        // better: IMHO
        if(!(obj instanceof Ship))
            return false;

        Ship other = (Ship)obj;
        return other.name.equals(name) && other.size == size && other.speed == speed;

        //THIS IS ALSO FINE
        if(obj instanceof Ship)
        {
            Ship other = (Ship)obj;
            return other.name.equals(name) && other.size == size && other.speed == speed;
        } 

        return false;
        
        
        
        
    }


    

}
