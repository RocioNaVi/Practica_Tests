package findLast;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import countPositive.countPositive;

public class findLastTest {
	private int[] list;   // Test fixture
	private int y;

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
	      y = 0;
	      try {
	    	  findLast.findLast (list,y);
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
	      y = 0;
	      findLast.findLast (list,y);
	   }

	   	
	    @Test (expected = NullPointerException.class)
	    public void testForSoloNullElement()
	    {
	    	list[0] = (Integer) null;
		    y = 0;
	    	findLast.findLast (list, y);
		}
	    
	    @Test (expected = NullPointerException.class)
	    public void testForNullElementY()
	    {
	    	list[0] = 0;
		    y = (Integer) null;
	    	findLast.findLast (list, y);
		}
}
