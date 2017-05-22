
package alg;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author varjasin
 */
public class VevoTest {
    Vevo vevo ;
    Rendeles rendeles;
    Pizza pizza;
    
    public VevoTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
        vevo = new Vevo("Béla");
        pizza = new Pizza(Pizza.ALAP, "alap");
        rendeles = new Rendeles(pizza, 1);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getNev method, of class Vevo.
     */
    @Test
    public void testGetNev() {
        System.out.println("getNev");

        String expResult = "Béla";
        String result = vevo.getNev();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of addRendeles method, of class Vevo.
     */
    @Test
    public void testAddRendeles() {
        System.out.println("addRendeles");
        
        vevo.addRendeles(rendeles);
        // TODO review the generated test code and remove the default call to fail.
        assertNotNull(vevo.getSzamla());
    }

    /**
     * Test of getSzamla method, of class Vevo.
     */
    @Test
    public void testGetSzamla() {
        System.out.println("getSzamla");
        String expResult = "";
        String result = vevo.getSzamla();
        
        // TODO review the generated test code and remove the default call to fail.
        assertNotNull(result);
    }
}
