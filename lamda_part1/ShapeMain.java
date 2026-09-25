public class ShapeMain 
{
    public static void main(String[] args)
    {
        Shape circle = (double radius)->{
            return Math.PI * Math.pow(radius, 2);
        };

        System.out.println(circle.area(10));

   
       
    }
}
