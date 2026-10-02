package iris;

public class Iris 
{
    private final double petalLength;
    private final double petalWidth;
    private final String type;

    public Iris(String line)
    {
        this(Double.parseDouble(line.split(",")[0]), Double.parseDouble(line.split(",")[1]), line.split(",")[2]);
    }

    public Iris(double length, double width, String type)
    {
        petalLength = length;
        petalWidth = width;
        this.type = type;
    }

    public double getPetalLength()
    {
        return petalLength;
    }

    public double getPetalWidth()
    {
        return petalWidth;
    }

    public String getType()
    {
        return type;
    }

    @Override 
    public String toString()
    {
        return String.format("Length:%.1f, Width:%.1f, Type:%s", petalLength, petalWidth, type);
    }
}
