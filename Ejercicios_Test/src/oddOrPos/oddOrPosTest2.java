package oddOrPos;

import static org.junit.Assert.assertTrue;

import static org.junit.Assert.*;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.*;

@RunWith (Parameterized.class)
public class oddOrPosTest2 {
	private int[] list = new int[3];;   // Test fixture
    public int count;

    public oddOrPosTest2 (int a, int b, int c, int count)
    {
       this.list[0] = a;
       this.list[1] = b;
       this.list[2] = c;
       this.count = count;
    }

   @Parameters
   public static Collection<Object[]> contarValues()
   {
       return Arrays.asList (new Object [][] {{1,-2,3,2}, {2,2,0,3}, {1,-4,-3,2}, {1,-2,-2,1}}); 
   }

   @Test
   public void additionTest()
   {
	   assertTrue ("Addition Test", count == oddOrPos.oddOrPos (list));
   }
}
