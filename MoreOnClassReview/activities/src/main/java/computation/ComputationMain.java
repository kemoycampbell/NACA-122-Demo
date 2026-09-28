package computation;

public class ComputationMain 
{

    public static void main(String args[])
    {
        //using our multiplier class
        MultiplicationCompute mult = new MultiplicationCompute();
        computeAndPrint(mult);

        //using lambda to give some new x and y
        //we are essential compute interface
        computeAndPrint((x, y) -> {
             return "(" + x + ", " + y + ")";
        });

    }

    public static void computeAndPrint(Computation c)
    {
        String result = c.compute(10.5, 2.7);
        System.out.println(result);
    }
    
}
