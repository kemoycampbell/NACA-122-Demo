package mcf;

public class ForEachGeneric 
{
    public static void main(String args[])
    {

        String[] testingData = {
            "5","6", "2", "1","10","15", "20","30","40","50","60","70","80",
            "90","100","3","4","7","8","9","11","12"
        };

        //works fine for built in --> using java default built in iterator
        // for(String data: testingData)
        // {
        //     System.out.println(data);
        // }

        //testing node queue based
        Queue<String> nodeQueue = new NodeQueue<String>();

        // System.out.println("Enqueuing");
        // for(String data: testingData){
        //     System.out.println("Adding "+ data+ " to the queue");
        //     nodeQueue.enqueue(data);
        // }
        Enqueuing(nodeQueue, testingData);

        //this is using our custom iterator because we had to tell java how to iterate
        for (String string : nodeQueue) {
            System.out.println("Removing "+ string+ " from the queue");
            nodeQueue.dequeue();
        }
    }


    public static void Enqueuing(Queue queue, String[] testingData)
    {
        System.out.println("Enqueuing");
        for(String data: testingData){
            System.out.println("Adding "+ data+ " to the queue");
            queue.enqueue(data);
        }
    }

}

