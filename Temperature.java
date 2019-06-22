package com.bridgelab;
import java.util.*;
import util.Utility;
public class Temperature {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int a;
		char b;
		do 
		{	
			System.out.println("Enter your choice: \n1.Celsius to fahrenheit\n2.fahrenheit to Celsius");
			a=s.nextInt();
			Utility.temperaturConversion(a);
			System.out.println("If you want to continue...Enter y...else enter any character...");
			b=s.next().charAt(0);
		}while(b=='y');

	}
}
