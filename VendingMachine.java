package com.bridgelab;
import java.util.*;
import util.Utility;

public class VendingMachine 
{
	public static void main(String[] args)
	{
		int N=0,i=0,c=0;
		int z;
		int a[]= {1000,500,100,50,10,5,2,1};
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Rs. : ");
		N=s.nextInt();
		
		System.out.println("\nNotes are:");
		if(N>0)
		{
			z=(int) Utility.vm(N,i,c,a);
			System.out.println("\nCount of notes are: "+z);
		}
		else
			System.out.println("\nRs. should be greater than 0 Rs.");
	}
}
/*Desc -> There is 1, 2, 5, 10, 50, 100, 500 and 1000 Rs Notes 
  which can be returned by Vending Machine. 
  Write a Program to calculate the minimum number of Notes 
  as well as the Notes to be returned by the Vending Machine as a Change
  I/P -> read the Change in Rs to be returned by the Vending Machine
  Logic -> Use Recursion and check for largest value of the Note to return change 
  to get to minimum number of Notes. 
  O/P -> Two Outputs - one the number of minimum Note needed to give the change 
  and second list of Rs Notes that would given in the Change
 */