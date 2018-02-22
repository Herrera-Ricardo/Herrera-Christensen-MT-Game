/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.mormontrail.control;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ricardo-Mini
 */
public class CharacterControlTest {
    
    public CharacterControlTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of calcPartySize method, of class CharacterControl.
     */
    @Test
    public void testCalcPartySize() {

        //  Test Case 1
        System.out.println("calcPartySize");
        System.out.println("/tTest Case 1");
        
        //define input variables
        double currentParty = 1.0;
        double newPersons = 3.0;
        // define expected output
        double expResult = 4.0;
        
        //call method
        double result = CharacterControl.calcPartySize(currentParty, newPersons);

        //test to see if the result returned equals expected result
        assertEquals(expResult, result, 0.0);
        
        //  Test Case 2
        System.out.println("calcPartySize");
        System.out.println("/tTest Case 2");
        
        //define input variables
        currentParty = 2.0;
        newPersons = 3.0;
        // define expected output
        expResult = 5.0;
        
        //call method
        result = CharacterControl.calcPartySize(currentParty, newPersons);

        //test to see if the result returned equals expected result
        assertEquals(expResult, result, 0.0);
        
        //  Test Case 3
        System.out.println("calcPartySize");
        System.out.println("/tTest Case 3");
        
        //define input variables
        currentParty = 2.0;
        newPersons = 3.0;
        // define expected output
        expResult = 5.0;
        
        //call method
        result = CharacterControl.calcPartySize(currentParty, newPersons);

        //test to see if the result returned equals expected result
        assertEquals(expResult, result, 0.0);
        
    }
    
}
