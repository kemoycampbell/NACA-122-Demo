package moreonclassreview;

/**
 * 
 * FinalAttributeInClass
 * 
 * Lesson:
 * A final variable once assigned any value ANY HOW( constructor, a setter)
 * cannot change after it has been assigned.
 * 
 * Think: One and Done
 * 
 * Immutable field
 * 
 */
public class FinalAttributeInClass 
{
    private final String name;
    private int age;

    /**
     * The constructor that initalize the private fields
     * @param name - the name to assign
     * @param age - the age to assign
     */
    public FinalAttributeInClass(String name, int age)
    {
        this.name = name;
        this.age = age;
        throw new Exception()
    }

    // public void attemptToChangeName(String name)
    // {
    //     this.name = name;
    // }

    /**
     * 
     * @return the name
     */
    public String getName()
    {
        return name;
    }

}
