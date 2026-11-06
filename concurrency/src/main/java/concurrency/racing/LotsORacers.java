package concurrency.racing;

import java.util.LinkedList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class LotsORacers 
{
    private final static int NUM_RACERS = 50;
    private final static int NUM_LAPS = 10;
    private final static boolean DEBUG = false;

    public static void threadRace()
    {
        long start = System.nanoTime();
        Thread[] threads = new Thread[NUM_RACERS];
        Racer[] racers = new Racer[NUM_RACERS];

        for(int i = 0; i < 50000; i++){
            //the name of the driver
            String driver = "racer" + (i+1);

            //create the driver object and add it to the array
            Racer racer = new Racer(driver, NUM_LAPS, DEBUG);
            racers[i] = racer;

            //create the thread and start it
            Thread thread = new Thread(racer::race);
            thread.start();
            
            //add the thread
            threads[i] = thread;
        }

        long end = System.nanoTime() - start;

        System.out.println("Time to run all threads: " + (end / 1_000_000_000.0));

        for (Racer driver : racers) {
           System.out.println(driver.getName() + " finished in:" + driver.getFinishTime()+" seconds");
        }
    }

    public static void threadRaceExecutorService()
    {
        ExecutorService executorService = Executors.newCachedThreadPool();
        long start = System.nanoTime();
        Racer[] racers = new Racer[NUM_RACERS];
        for(int i = 0; i < NUM_RACERS; i++){
            String driver = "racer" + (i+1);

            //create the driver object and add it to the array
            Racer racer = new Racer(driver, NUM_LAPS, DEBUG);
            racers[i] = racer;

            //add the task to the executorService.submit
            //remember that submit take anything that is runnable so we can pass a runnable or functional runnable
            //lambda
            executorService.submit(racer::race);
        }

        
        executorService.shutdown();
        long end = System.nanoTime() - start;
        System.out.println("Time to run all threads: " + (end / 1_000_000_000.0));

        //show all info
        for (Racer driver : racers) {
           System.out.println(driver.getName() + " finished in:" + driver.getFinishTime()+" seconds");
        }

    }

    public static void threadRaceExecutorServiceTimeout()
    {
        ExecutorService executorService = Executors.newCachedThreadPool();
        long start = System.nanoTime();
        Racer[] racers = new Racer[NUM_RACERS];
        for(int i = 0; i < NUM_RACERS; i++){
            String driver = "racer" + (i+1);

            //create the driver object and add it to the array
            Racer racer = new Racer(driver, NUM_LAPS, DEBUG);
            racers[i] = racer;

            //add the task to the executorService.submit
            //remember that submit take anything that is runnable so we can pass a runnable or functional runnable
            //lambda
            executorService.submit(racer::race);
        }

        
        executorService.shutdown();
        try{
            executorService.awaitTermination(1, TimeUnit.MINUTES);
        }catch(InterruptedException e)
        {
            System.out.println("executor service was interrupted!");
        }
        long end = System.nanoTime() - start;
        System.out.println("Time to run all threads: " + (end / 1_000_000_000.0));

        //show all info
        for (Racer driver : racers) {
           System.out.println(driver.getName() + " finished in:" + driver.getFinishTime()+" seconds");
        }

    }

    public static void latchRace()
    {
        ExecutorService executorService = Executors.newCachedThreadPool();
        long startTime = System.nanoTime();
        LinkedList<Racer> racers = new LinkedList<Racer>();
        CountDownLatch start = new CountDownLatch(1);
        CountDownLatch end = new CountDownLatch(NUM_RACERS);

        for(int i = 0; i < NUM_RACERS; i++){
            String driver = "racer" + (i+1);

            //create the driver object and add it to the array
            Racer racer = new Racer(driver, NUM_LAPS, DEBUG);
           

            executorService.submit(()->{
                try{
                    start.await();
                    racer.race();
                    racers.add(racer);
                    end.countDown();
                }catch(InterruptedException e)
                {
                    System.out.println(driver + " jumped the gun! DISQUALIFIED");
                }
            });

        }

        
        executorService.shutdown();

        System.out.println("All racers are at the gate ready to start the race");
        start.countDown();
        try{
            end.await();
        }
        catch(InterruptedException e)
        {
            System.out.println("Something prevent the end from properly waiting until everyone is finished racing");
        }
    
        long endTime = System.nanoTime() - startTime;
        System.out.println("Time to run all threads: " + (endTime / 1_000_000_000.0));

        //show all info
        for (Racer driver : racers) {
           System.out.println(driver.getName() + " finished in:" + driver.getFinishTime()+" seconds");
        }

        //show the winner
        System.out.println(racers.get(0).getName() + "Finished first with a time of : " + racers.get(0).getFinishTime());
    }

    public static void main(String args[])
    {
        //threadRace();
        //threadRaceExecutorService();
        //threadRaceExecutorServiceTimeout();
        latchRace();
    }

}
