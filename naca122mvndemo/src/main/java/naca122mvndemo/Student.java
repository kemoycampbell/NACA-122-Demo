package naca122mvndemo;

public class Student 
{

    //setting up the private variables
    private String name;
    private int year;

    public Student(String name, int year)
    {
        this.setName(name);
        this.year = year;
    }

    //creating the setters and getters
    public void setName(String name)
    {
        if(name.strip().isEmpty()){
            name = "Name Unknown";
        }
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public String doHomework()
    {
        return "Doing Homework";
    }

    public String doHomework(int howMany)
    {
        return String.format("Doing %d Homeworks", howMany);
    }

    @Override 
    public String toString()
    {
        return String.format("Class:%s\nName:%s\nYear:%s"  , this.getClass().getName(), name, year);


    }

}
