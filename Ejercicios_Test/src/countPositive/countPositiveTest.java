package countPositive;

import static org.junit.Assert.*;
import org.junit.*;
import org.junit.runners.Parameterized.Parameters;

import java.util.*;

public class countPositiveTest {
	private int[] list;   // Test fixture

	   @Before      // Set up - Called before every test method.
	   public void setUp()
	   {
	      list = new int[3];
	   }

	   @After      // Tear down - Called after every test method.
	   public void tearDown()
	   {
	      list = null;  // redundant in this example!
	   }

	   @Test
	   public void testForNullList()
	   {
	      list = null;
	      try {
	    	  countPositive.contar (list);
	      } catch (NullPointerException e) {
	         return;
	      }
	      fail ("NullPointerException expected");
	   }

	   @Test (expected = NullPointerException.class)
	   public void testForNullElement()
	   {
	      list[0] = (Integer) null;
	      list[1] = 4;
	      countPositive.contar (list);
	   }

	   	/*Este test daba fallo*/
	    @Test (expected = NullPointerException.class)
	    public void testForSoloNullElement()
	    {
	    	list[0] = (Integer) null;
	    	countPositive.contar (list);
		}
	    
	    

}
