/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.mormontrail.control;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rherrerajr
 */
public class InventoryControlTest {
    
    public InventoryControlTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calcMaxWeight method, of class InventoryControl.
     */
    @Test
    public void testCalcMaxWeight() {
        System.out.println("calcMaxWeight");
        // Test case 1
        System.out.println("\tTest Case 1");
        
//        define input variables
        double wagon = 3.0;
        double oxen =5.0;
        
        double expResult = 4500.0; //define expected output variable
        
//        call the method
        double result = InventoryControl.calcMaxWeight(wagon, oxen);
//        test to see if the result returned equals the expected result
        assertEquals(expResult, result, 0.9);
        
        // Test case 2
        System.out.println("\tTest Case 2");
        
//        define input variables
        wagon = 1.0;
        oxen =2.0;
        
        expResult = 1000.0; //define expected output variable
        
//        call the method
        result = InventoryControl.calcMaxWeight(wagon, oxen);
//        test to see if the result returned equals the expected result
        assertEquals(expResult, result, 0.9);
        
        // Test case 3
        System.out.println("\tTest Case 3");
        
//        define input variables
        wagon = 1.0;
        oxen =1.0;
        
        expResult = 500.0; //define expected output variable
        
//        call the method
        result = InventoryControl.calcMaxWeight(wagon, oxen);
//        test to see if the result returned equals the expected result
        assertEquals(expResult, result, 0.9);
        
        // Test case 4
        System.out.println("\tTest Case 4");
        
//        define input variables
        wagon = 3.0;
        oxen =9.0;
        
        expResult = 8000.0; //define expected output variable
        
//        call the method
        result = InventoryControl.calcMaxWeight(wagon, oxen);
//        test to see if the result returned equals the expected result
        assertEquals(expResult, result, 0.9);
        
        // Test case 5
        System.out.println("\tTest Case 5");
        
//        define input variables
        wagon = 2.0;
        oxen =5.0;
        
        expResult = 3500.0; //define expected output variable
        
//        call the method
        result = InventoryControl.calcMaxWeight(wagon, oxen);
//        test to see if the result returned equals the expected result
        assertEquals(expResult, result, 0.9);
        
        // Test case 6
        System.out.println("\tTest Case 6");
        
//        define input variables
        wagon = 3.0;
        oxen =2.0;
        
        expResult = 1500.0; //define expected output variable
        
//        call the method
        result = InventoryControl.calcMaxWeight(wagon, oxen);
//        test to see if the result returned equals the expected result
        assertEquals(expResult, result, 0.9);
       
    }
    
}
