package com.bridgelab;
import java.util.*;
import util.Utility;

public class InsertionSort 
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("How many Characters you want to enter for sorting...");
		int a=s.nextInt();
		System.out.println("Enter character for sorting...");
		char[] b = new char[a];
		for (int i = 0; i < a; i++) {
		    char s1 =s.next().charAt(0);
			b[i]=s1;
		}
		Utility.insertionSortStr(b, a);
		System.out.println("Sorted list...");
	}
}
