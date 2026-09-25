public abstract class Pet implements Speakable
{
    private String name;
    private int age;

    public Pet(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    @Override
    public abstract String speak();
    
}
