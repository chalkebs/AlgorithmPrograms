package com.bridgelab;
import java.util.*;
import util.Utility;
public class DayOfWeek {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int d,m,y;
		System.out.println("Enter day: ");
		d=s.nextInt();
		System.out.println("Enter month: ");
		m=s.nextInt();
		System.out.println("Enter year: ");
		y=s.nextInt();
		
		Utility.dayOfWeek(d,m,y);
				
	}

}
