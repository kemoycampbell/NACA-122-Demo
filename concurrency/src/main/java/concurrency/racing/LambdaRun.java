package concurrency.racing;

public class LambdaRun 
{
    public static void main(String args[])
    {
        //create 3 rafcer class
        Racer mario = new Racer("Mario", 10, true);
        Racer nathan = new Racer("Nathan", 10, true);
        Racer ahmed = new Racer("Ahmed", 10, true);


        //create 3 threads for the runnables
        Thread marioThread = new Thread(mario::race);
        Thread nathanThread = new Thread(nathan::race);
        Thread ahmedThread = new Thread(ahmed::race);

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

}
