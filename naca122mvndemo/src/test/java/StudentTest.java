
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import naca122mvndemo.Student;

public class StudentTest {
    @Test
    public void TestUnKnownName()
    {
        //setup
        String name = "";
        String expected = "Name Unknown";
        

        //invoke
        Student unknownStudent = new Student(name, 0);
        String result = unknownStudent.getName();


        //assess
        assertEquals(expected, result);
    }

    @Test
    public void TestGivenName()
    {
        //setup
        String name = "Nathan";
        String expected = "Nathan";
        

        //invoke
        Student unknownStudent = new Student(name, 0);
        String result = unknownStudent.getName();


        //assess
        //the third option is optional but it gives you control over
        //you error message if the expect result doesnt match
        assertEquals(expected, result, "Expected Nathan but got " + result);
        
        //there are different type of asserts, use what you need assert<WhatYouNeed>
    }
}
