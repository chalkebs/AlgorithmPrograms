package com.bridgelab;
import java.util.*;
import java.util.ArrayList;
import util.Utility;

public class ToBinary 
{
	public static void main(String[]args)
	{	
		Scanner s=new Scanner(System.in);
		System.out.println("Enter decimal number...");
		int b=s.nextInt();
		Utility.toBinary(b);
	}
}
