package oddOrPos;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import lastZero.lastZero;

public class oddOrPosTest {
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
	    	  oddOrPos.oddOrPos (list);
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
	      oddOrPos.oddOrPos (list);
	   }

	    @Test (expected = NullPointerException.class)
	    public void testForSoloNullElement()
	    {
	    	list[0] = (Integer) null;
	    	oddOrPos.oddOrPos (list);
		}
}
