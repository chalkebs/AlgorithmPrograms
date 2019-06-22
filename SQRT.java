package com.bridgelab;
import java.util.*;
import util.Utility;

public class SQRT 
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no. to compute square root of...");
		double c=s.nextDouble();
		Utility.sqrt(c);
	}
}
