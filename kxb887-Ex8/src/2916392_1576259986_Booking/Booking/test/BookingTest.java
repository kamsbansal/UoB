/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hp
 */
public class BookingTest {
    
    public BookingTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getRoom method, of class Booking.
     */
    @Test
    public void testGetRoom() {
        System.out.println("getRoom");
        Booking instance = null;
        String expResult = "";
        String result = instance.getRoom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRoom method, of class Booking.
     */
    @Test
    public void testSetRoom() {
        System.out.println("setRoom");
        String _room = "";
        Booking instance = null;
        instance.setRoom(_room);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDate method, of class Booking.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        Booking instance = null;
        Date expResult = null;
        Date result = instance.getDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDate method, of class Booking.
     */
    @Test
    public void testSetDate() {
        System.out.println("setDate");
        Date _date = null;
        Booking instance = null;
        instance.setDate(_date);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHour method, of class Booking.
     */
    @Test
    public void testGetHour() {
        System.out.println("getHour");
        Booking instance = null;
        int expResult = 0;
        int result = instance.getHour();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPurpose method, of class Booking.
     */
    @Test
    public void testSetPurpose() {
        System.out.println("setPurpose");
        String _purpose = "";
        Booking instance = null;
        instance.setPurpose(_purpose);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPurpose method, of class Booking.
     */
    @Test
    public void testGetPurpose() {
        System.out.println("getPurpose");
        Booking instance = null;
        String expResult = "";
        String result = instance.getPurpose();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
