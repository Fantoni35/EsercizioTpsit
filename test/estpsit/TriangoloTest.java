/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estpsit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PC
 */
public class TriangoloTest {
    
    public TriangoloTest() {
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
     * Test of riconoscimentotriangolo method, of class Triangolo.
     */
    @Test
    public void testRiconoscimentotriangolo() {
        System.out.println("riconoscimentotriangolo");
        Triangolo instance = new Triangolo(1,1,1);
        String expResult = "equilatero";
        String result = instance.riconoscimentotriangolo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of areaTriangolo method, of class Triangolo.
     */
    @Test
    public void testAreaTriangolo() {
        System.out.println("areaTriangolo");
        Triangolo instance =new Triangolo(1,1,1);
        double expResult = 0.0;
        double result = instance.areaTriangolo();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of perimetroTriangolo method, of class Triangolo.
     */
    @Test
    public void testPerimetroTriangolo() {
        System.out.println("perimetroTriangolo");
        Triangolo instance = new Triangolo(1,1,1);
        double expResult = 3.0;
        double result = instance.perimetroTriangolo();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
