package shape;

public class AllShapes 
{

    public static void main(String args[])
    {
        Shape triangle = Triangle::triangleArea;

        System.out.println(triangle.area(3));
    }
    
}
