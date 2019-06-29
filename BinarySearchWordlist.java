package com.bridgelab;

import java.io.File;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
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
		System.out.println("ArrayList:");
		System.out.println(listOfLines);
		
		Collections.sort(listOfLines);
		
		BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
		for (String line1 : listOfLines)
		{
		 writer.write(line1);
		 writer.newLine();
		}
		
		System.out.println("\nSorted ArrayList:");
		System.out.println(listOfLines);
		
		br.close();
		writer.close();
		System.out.println();
		
		Scanner s=new Scanner(System.in);
		System.out.println("\nEnter string which you want to search in list...");
		String str=s.nextLine();
		Utility.binarySearchword(str,listOfLines);
	}
}
