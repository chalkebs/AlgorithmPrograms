package com.bridgelab;
import java.util.*;
import util.Utility;

public class MonthlyPayment 
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		double P,Y,R;
		
		//Y= years to pay off
		System.out.println("Enter year to pay off...");
		Y=s.nextDouble();
		
		//P= principal loan amount
		System.out.println("Enter principal loan amount...");
		P=s.nextDouble();
		
		//R= percent interest
		System.out.println("Enter percent interest2...");
		R=s.nextDouble();
		
		Utility.monthlyPayment(Y,P,R);
	}
}
