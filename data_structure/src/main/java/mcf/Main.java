package mcf;

public class Main 
{
    public static void main(String args[]){

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

        // // System.out.println(nodeQueue);
        // // System.out.println("Dequeuing");
        // // while(nodeQueue.size() > 0) {
        // //     System.out.println("Dequeue:" + nodeQueue.dequeue());
        // // }
        Dequeuing(nodeQueue);

        // //testing array based
        Queue<String> arrayQueue = new ArrayQueue<String>();

        Enqueuing(arrayQueue, testingData);
        Dequeuing(arrayQueue);

        //autoboxing & primitive type
        //you cannot use primitive as parameter for generic type
        //Queue<int> example = new NodeQueue<int>();

        //instead use the refrence types eg: Integer, String, etc "the class equivalent of the primitve type"
        Queue<Integer> example = new NodeQueue<Integer>();
    

        //the wrapper can translate between its class reference type and primitive
        //this concept is called autoboxing and unboxing
        int aIntData = 5;
        //autoboxing
        example.enqueue(aIntData);

        //unboxing
        int data = example.dequeue();
        System.out.println(data);



    }

    public static void Enqueuing(Queue queue, String[] testingData)
    {
        System.out.println("Enqueuing");
        for(String data: testingData){
            System.out.println("Adding "+ data+ " to the queue");
            queue.enqueue(data);
        }
    }

    public static void Dequeuing(Queue queue)
    {
        System.out.println(queue);
        System.out.println("Dequeuing");
        while(queue.size() > 0) {
            System.out.println("Dequeue:" + queue.dequeue());
        }
    }
}
