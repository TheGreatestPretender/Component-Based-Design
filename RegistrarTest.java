/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author foxx
 */
public class RegistrarTest {

    @Test
    public void testCanRegister_1() {
        
        Registrar R = new Registrar();
        boolean actual = R.canRegister(16, 2.99);
        boolean expected = false;
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testCanRegister_2() {
        
        Registrar R = new Registrar();
        boolean actual = R.canRegister(16, 3.00);
        boolean expected = true;
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testCanRegister_3() {
        //New rule: student with gpa < 2.0 cannot register
        //without advisor override
        Registrar R = new Registrar();
        R.setOverride(false);
        boolean actual = R.canRegister(1, 1.99);
        boolean expected = false;
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testCanRegister_4() {
        //New rule: student with gpa < 2.0 cannot register
        //without advisor override
        Registrar R = new Registrar();
        R.setOverride(true);
        boolean actual = R.canRegister(1, 1.99);
        boolean expected = true;
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testCanRegister_5() {
        //New rule: student with gpa < 2.0 cannot register
        //without advisor override
        Registrar R = new Registrar();
        R.setOverride(false);
        boolean actual = R.canRegister(25, 1.99);
        boolean expected = false;
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testCanRegister_6() {
        //New rule: student with gpa < 2.0 cannot register
        //without advisor override
        Registrar R = new Registrar();
        R.setOverride(true);
        boolean actual = R.canRegister(20, 1.99);
        boolean expected = true;
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testCanRegister_7() {
        //New rule: student with gpa < 2.0 cannot register
        //without advisor override
        Registrar R = new Registrar();
        R.setOverride(false);
        boolean actual = R.canRegister(3, 4.0);
        boolean expected = true;
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testCanRegister_8() {
        //New rule: student with gpa < 2.0 cannot register
        //without advisor override
        Registrar R = new Registrar();
        R.setOverride(false);
        boolean actual = R.canRegister(12, 0.5);
        boolean expected = false;
        
        assertEquals(expected, actual);
    }
}
