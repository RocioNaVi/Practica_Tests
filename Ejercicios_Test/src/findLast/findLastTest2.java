package findLast;

import static org.junit.Assert.assertTrue;

import static org.junit.Assert.*;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.*;

@RunWith (Parameterized.class)
public class findLastTest2 {
	private int[] list = new int[3];;   // Test fixture
    public int pos;
    public int y;

    public findLastTest2 (int a, int b, int c, int y, int pos)
    {
       this.list[0] = a;
       this.list[1] = b;
       this.list[2] = c;
       this.y = y;
       this.pos = pos;
    }

   @Parameters
   public static Collection<Object[]> contarValues()
   {
       return Arrays.asList (new Object [][] {{-1,-1,-1,-1, 2}, {2,2,0,3,-1}, {0,4,7,0,0}, {0,4,0,4,1}, {0,-8,-9,-8,1}}); 
   }

   @Test
   public void additionTest()
   {
	   assertTrue ("Addition Test", pos == findLast.findLast (list, y));
   }
}
