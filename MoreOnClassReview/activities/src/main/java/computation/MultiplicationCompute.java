package computation;

public class MultiplicationCompute implements Computation {

    @Override
    public String compute(double x, double y) {

        String result = String.format("%f x %f = %f", x,y,x*y);
        return result;
    }
    
}
