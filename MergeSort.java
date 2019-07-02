package abcd;
import java.util.*;
import util.Utility;

public class MergeSort 
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no. of elements...");
		int a=s.nextInt();
		System.out.println("Enter the elements for sorting...");
		int b[]=new int[a];
		for(int i=0;i<a;i++)
			b[i]=s.nextInt();
		Utility.mergeSort(b,0,a-1);
		System.out.println("Sorted array is...");
		for(int i=0;i<b.length;i++)
			System.out.print(b[i]+" ");
	}
}
