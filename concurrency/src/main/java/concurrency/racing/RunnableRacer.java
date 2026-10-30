package concurrency.racing;

import java.util.List;

public class RunnableRacer extends Racer implements  Runnable
{

    public RunnableRacer(String name, int numLaps, boolean debug)
    {
        super(name, numLaps, debug);
    }

    public RunnableRacer(String name, int numLaps)
    {
        super(name, numLaps);

    }
    @Override
    public void run() {
        race();
    }

    public static void runnables()
    {

        //create 3 runnables
        RunnableRacer mario = new RunnableRacer("Mario", 10, true);
        RunnableRacer nathan = new RunnableRacer("Nathan", 10, true);
        RunnableRacer ahmed = new RunnableRacer("Ahmed", 10, true);


        //create 3 threads for the runnables
        Thread marioThread = new Thread(mario);
        Thread nathanThread = new Thread(nathan);
        Thread ahmedThread = new Thread(ahmed);

        //start the threads
        marioThread.start();
        nathanThread.start();
        ahmedThread.start();

        //we will poll to see if the thread is alive then we wait before print the race time
        while(marioThread.isAlive() || nathanThread.isAlive() || ahmedThread.isAlive()){
            continue;
        }

        //show times
        System.out.println (mario.getName() + " Finished in " + mario.getFinishTime() + " seconds");
        System.out.println (nathan.getName() + " Finished in " + nathan.getFinishTime() + " seconds");
        System.out.println (ahmed.getName() + " Finished in " + ahmed.getFinishTime() + " seconds");


    }


    public static void main(String[] args)
    {
        runnables();
    }

}
