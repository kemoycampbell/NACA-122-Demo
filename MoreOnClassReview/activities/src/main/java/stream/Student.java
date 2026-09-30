package stream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;

public class Student 
{
    private String firstName;
    private String lastName;

    public Student(
        String firstName,
        String lastName
    )
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName()
    {
        return this.firstName;
    }

    public String getLastName()
    {
        return this.lastName;
    }

    @Override 
    public String toString()
    {
        return "{" + this.lastName + ", " + this.firstName + "}";
    }

    static int totalNamesLength;
    public static void main(String args[])
    {
        // Student[] students = new Student[5];
        Student[] students = {
            new Student("Nathan", "Facey"),
            new Student("Ahmed", "Sharif"),
            new Student("Justin", "Mark"),
            new Student("Shawn", "Peter"),
            new Student("Decker", "Ayers")
        };

        System.out.println(Arrays.toString(students));

        //getting the students as a stream object
        Stream<Student> studentsStream  = Arrays.stream(students);

        

        //studentsStream.forEach(name-> totalNamesLength+=name.firstName.length() + name.getLastName().length() );
        //System.out.println("The names of all students combine total length is: " + totalNamesLength);


        Stream<Student> sStudents = studentsStream.filter(name -> name.firstName.startsWith("S"));
        sStudents.forEach(System.out::println);

        //shorthand using chaning
        //studentsStream.filter(name -> name.firstName.startsWith("S")).forEach(System.out::println);

        //same as
        for (Student student : students) {
            if(student.firstName.startsWith("S"))
                System.out.println(student);
        }

        //stream are one and done operation.. if you try to use a stream
        //after it has already be used , you will get an error!
        //uncomment this line to see the error
        //studentsStream.forEach(name-> totalNamesLength+=name.firstName.length() + name.getLastName().length() );


        Arrays.stream(students).forEach(student -> System.out.println(student.getFirstName() + " "+ student.getLastName()));

        Arrays.stream(students).
        filter(student-> student.firstName.toLowerCase().startsWith("s") || student.lastName.toLowerCase().startsWith("s")).
        forEach(System.out::println);


        
    }
    
}
