package concurrency.racing;

import java.util.Random;

public class Racer 
{
    private String name;
    private int numLaps;
    private long time;
    private boolean debug;
    private final static int MIN_MILS = 20;
    private final static int MAX_MILS = 100;

    private Random random;


    public Racer(String name, int numLaps, boolean debug)
    {
        this.name = name;
        this.numLaps = numLaps;
        this.debug = debug;
        this.random = new Random();
    }

    public Racer(String name, int numLaps)
    {
        this(name, numLaps, false);
    }

    public void race()
    {
        long start = System.nanoTime();
        for(int lap = 0; lap < numLaps; lap++){
            try{
                int sleepTime = random.nextInt(MIN_MILS, MAX_MILS + 1);
                Thread.sleep(sleepTime);
            }catch(InterruptedException e){
                //we will do nothing in this one... but in real world
                //you want to do something such as log it for observability
            }

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
