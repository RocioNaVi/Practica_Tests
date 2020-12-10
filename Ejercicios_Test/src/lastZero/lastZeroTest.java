package lastZero;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameters;

import countPositive.countPositive;
import lastZero.lastZero;

public class lastZeroTest {
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
	    	  lastZero.lastZero (list);
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
	      lastZero.lastZero (list);
	   }

	   	/*Este test daba fallo*/
	    @Test (expected = NullPointerException.class)
	    public void testForSoloNullElement()
	    {
	    	list[0] = (Integer) null;
	    	lastZero.lastZero (list);
		}
	    
}
