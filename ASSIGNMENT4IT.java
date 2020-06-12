/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author rabia
 */
 @RunWith(Parameterized.class)
public class ASSIGNMENT4IT {
    
    
    @Before
    public void setUp() {
         System.out.println("Function finished executing");
    }
    
    @After
    public void tearDown() {
         System.out.println("Function started executing");
    }

    /**
     * Test of function method, of class ASSIGNMENT4.
     */
    @Test
    public void testFunction() {
        System.out.println("function");
        String expectedResult = "All numbers are equal";
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        
        String result;
        result = ASSIGNMENT4.function(num1, num2, num3);
        assertEquals(expectedResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
 @Test1
    public void testFunction() {
        System.out.println("function");
        
        int num1 = 5;
        int num2 = 6;
        int num3 = 3;
        String expectedResult =  num2 +"is greater";
        String result;
        result = ASSIGNMENT4.function(num1, num2, num3);
        assertEquals(expectedResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
     @Test2
    public void testFunction() {
        System.out.println("function");
        
        int num1 = 6;
        int num2 = 4;
        int num3 = 2;
        String expectedResult = num1+"is greater";
        String result;
        result = ASSIGNMENT4.function(num1, num2, num3);
        assertEquals(expectedResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
     @Test3
    public void testFunction() {
        System.out.println("function");
        
        int num1 = 5;
        int num2 = 7;
        int num3 = 9;
         String expectedResult = num3+"is greater";
        String result;
        result = ASSIGNMENT4.function(num1, num2, num3);
        assertEquals(expectedResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
     @Test4
    public void testFunction() {
        System.out.println("function");
        String expectedResult = "Number formate error ";
        int num1 = 3;
        int num2 = "fo";
        int num3 = 9;
        
        String result;
        result = ASSIGNMENT4.function(num1, num2, num3);
        assertEquals(expectedResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    /**
     * Test of main method, of class ASSIGNMENT4.

    
}
