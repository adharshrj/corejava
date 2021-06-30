package WK2.D2.listsum;
import java.util.*;


public class TreeSet1
{
	public static void main(String[]args)
	{
		TreeSet<Integer> num = new TreeSet<>();
		num.add(5);
		num.add(5);
		num.add(2);
		int sum=0;
		
		Integer a[] = new Integer[num.size()];
		num.toArray(a);
		for(int i =0; i< a.length; i++)
		{
			sum+= a[i];
		}	System.out.println(sum);
	}
}
