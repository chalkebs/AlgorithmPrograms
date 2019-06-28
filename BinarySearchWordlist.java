package com.bridgelab;

import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;
import util.Utility;

public class BinarySearchWordlist 
{
	public static void main(String[] args) throws Exception
	{
		File f = new File("/home/user/Documents/Bhagyashri/Algorithmic/Wordlist.txt");
		
		BufferedReader br = new BufferedReader(new FileReader("WordList.txt"));
		ArrayList<String> listOfLines = new ArrayList<>();

		String line = br.readLine();
		while (line != null) 
		{
			listOfLines.add(line);
			line = br.readLine();
		}
		System.out.println("Content of ArrayList:");
		System.out.println(listOfLines);
	
		br.close();

		String s1=listOfLines.toString().replaceAll(",", "");
		char[] s2 = s1.substring(1, s1.length()-1).replaceAll(" ", "").toCharArray();
		
		for(int i=0;i<s2.length;i++)
			System.out.println(s2[i]);
			
		int b2=listOfLines.size();
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
		System.out.println();
		
		Scanner s=new Scanner(System.in);
		System.out.println("\nEnter string which you want to search in list...");
		char str= s.next().charAt(0);
		Utility.binarySearchStr(s2,0,b2-1,str);
	}
}
