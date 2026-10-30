package concurrency.racing;

public class Racer 
{
    private String name;
    private int numLaps;
    private long time;
    private boolean debug;


    public Racer(String name, int numLaps, boolean debug)
    {
        this.name = name;
        this.numLaps = numLaps;
        this.debug = debug;
    }

    public Racer(String name, int numLaps)
    {
        this(name, numLaps, false);
    }

    public void race()
    {
        long start = System.nanoTime();
        for(int lap = 0; lap < numLaps; lap++){
            if(debug)
                System.out.println(String.format("%s completed %d", name, lap));
        }

        this.time = (System.nanoTime() - start);
    }

    public String getName()
    {
        return this.name;
    }

    public double getFinishTime()
    {
        //System.out.println(time);
        return (time / 1_000_000_000.0);
    }

    public static void main(String args[])
    {
        String[] racers = {
            "Mario",
            "Nathan",
            "Ahmed"
        };

        for(String racer: racers){
            Racer driver = new Racer(racer, 10, true);
            driver.race();
            System.out.println(driver + " finished in:" + driver.getFinishTime()+" seconds");
        }

        
    }

}
