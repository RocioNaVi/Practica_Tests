package lastZero;

public class lastZero {
	/**
	 *  Find LAST index of zero
	 *  @param x array to search
	 *  @return index of last 0 in x; -1 if absent
	 *  @throws NullPointerException if x is null*/
	
	public static int lastZero (int[] x)
	{
		for (int i = x.length-1; i >= 0; i--)
		{
			if (x[i] == 0)
			{
				return i;
			}
		}
		return -1;
	}
}

/** Vemos que el error viene cuando hay mas de un 0
 * la sentencia que añadimos es la línea: 12
 * antes estaba como : for (int i = 0; i < x.length; i++)
 */
