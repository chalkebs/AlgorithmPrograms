package com.bridgelab;
import java.util.*;
import util.Utility;

public class BubbleSort 
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("How many elements you want to sort...");
		int a=s.nextInt();
		System.out.println("Enter integers for sorting...");
		int[] b = new int[a];
		for (int i = 0; i < a; i++) {
		    int n=s.nextInt();
			b[i] = n;
		}
		Utility.bubbleSortInt(b, a);
	}
}
