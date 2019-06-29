package com.bridgelab;
import java.util.*;

import util.Utility;

public class FindNumber 
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter value for N which is power of 2...");
		int N=s.nextInt();
		int R=N;
		if(N>0)
		{
			while(N%2==0)
			{
				N=N/2;
			}
			if(N==1)
			{
				Utility.findNumber(R);
			}
		}
		else if(N==0||N!=1)
			{
				System.out.println("Enter proper value for N which is power of 2");
				return;
			}
	}
}
/*Desc -> takes a command-line argument N, 
  asks you to think of a number between 0 and N-1,
  where N = 2^n, and always guesses the answer with n questions.
  I/P -> the Number N and then recursively ask true/false
  if the number is between a high and low value
  Logic -> Use Binary Search to find the number
  O/P -> Print the intermediary number and the final answer*/
