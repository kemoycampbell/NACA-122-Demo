package mcf;

public class ForEachGeneric 
{
    public static void main(String args[])
    {

        String[] testingData = {
            "5","6", "2", "1","10","15", "20","30","40","50","60","70","80",
            "90","100","3","4","7","8","9","11","12"
        };

        //testing node queue based
        Queue<String> nodeQueue = new NodeQueue<String>();

        // System.out.println("Enqueuing");
        // for(String data: testingData){
        //     System.out.println("Adding "+ data+ " to the queue");
        //     nodeQueue.enqueue(data);
        // }
        Enqueuing(nodeQueue, testingData);

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

