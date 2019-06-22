package com.bridgelab;
import java.util.*;
import util.Utility;
public class Anagram {
	public static void main(String[] args) {
	
	Scanner n=new Scanner(System.in);
	System.out.println("Enter First String");
    String a= n.nextLine();
    System.out.println("Enter second String");
    String b= n.nextLine(); 
    Utility.Anagram1(a,b);
    
}

}
