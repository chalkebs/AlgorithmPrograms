package com.bridgelab;
import java.util.*;

import util.Utility;

public class SearchSort {
	public static void main(String[]args)
	{
		/*Desc -> Create Utility Class having following static methods
					binarySearch method for integer
					binarySearch method for String
					insertionSort method for integer
					insertionSort method for String
					bubbleSort method for integer
					bubbleSort method for String
		  I/P -> Write main function to call the utility function
		  Logic -> Check using Stopwatch the Elapsed Time for every method call
		  O/P -> Output the Search and Sorted List.
		  More importantly print elapsed time performance in descending order*/
		
		String s1= "bridgelabz";
		char[] s2=s1.toCharArray();
		int b2=s2.length;
		int[] a1= {3,2,1,5,6,9,8,7,4};
		int b3=a1.length;
		long[] a2=new long[6];
		
		//-----------------------------------//
		long start=System.currentTimeMillis();
		//binarySearchInt
		{
			int i,j,temp;
			for(i=0;i<b3-1;i++)
			{
				for(j=i+1;j<b3;j++)
				{
					if(a1[i]>a1[j])
					{
						temp=a1[i];
						a1[i]=a1[j];
						a1[j]=temp;
					}
				}
			}
		}
		Scanner s=new Scanner(System.in);
		System.out.println("\nEnter number which you want to search in list...");
		int a=s.nextInt();
		Utility.binarySearchInt(a1,0,b3-1,a);

		long stop=System.currentTimeMillis();
		a2[0]=stop-start;
		//-----------------------------------//
		
		
		//-----------------------------------//
		long start1=System.currentTimeMillis();
		//binarySearchStr
		{
			int i,j;
			char temp;
			for(i=0;i<b2-1;i++)
			{
				for(j=i+1;j<b2;j++)
				{
					if(s2[i]>s2[j])
					{
						temp=s2[i];
						s2[i]=s2[j];
						s2[j]=temp;
					}
				}
			}
		}
		
		System.out.println("\nEnter character which you want to search in list...");
		char str= s.next().charAt(0);
		Utility.binarySearchStr(s2,0,b2-1,str);
		long stop1=System.currentTimeMillis();
		a2[1]=stop1-start1;
		//-----------------------------------//
		
	
		//-----------------------------------//
		long start2=System.currentTimeMillis();
		//insertionSortInt
		System.out.println("\nInsertion sorting of Integer array....");
		Utility.insertionSortInt(a1,b3);
		long stop2=System.currentTimeMillis();
		a2[2]=stop2-start2;
		//-----------------------------------//
		
		
		//-----------------------------------//
		long start3=System.currentTimeMillis();
		//insertionSortStr
		System.out.println("\nInsertion sorting of character array....");
		Utility.insertionSortStr(s2,b2);
		long stop3=System.currentTimeMillis();
		a2[3]=stop3-start3;
		//-----------------------------------//
		
		
		//-----------------------------------//
		long start4=System.currentTimeMillis();
		//bubbleSortInt
		Utility.bubbleSortInt(a1,b3);
		long stop4=System.currentTimeMillis();
		a2[4]=stop4-start4;
		//-----------------------------------//
		
		
		//-----------------------------------//
		long start5=System.currentTimeMillis();
		//bubbleSortStr
		Utility.bubbleSortStr(s2,b2);
		long stop5=System.currentTimeMillis();
		a2[5]=stop5-start5;
		//-----------------------------------//
		
		
		//-----------------------------------//
		int i,j;
		long temp;
		for(i=0;i<6-1;i++)
		{
			for(j=i+1;j<6;j++)
			{
				if(a2[i]<a2[j])
				{
					temp=a2[i];
					a2[i]=a2[j];
					a2[j]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("\nElapsed time...");
		for(i=0;i<6;i++)
			System.out.println(" "+(i+1)+"--->"+a2[i]);
		//-----------------------------------//
	}
}
