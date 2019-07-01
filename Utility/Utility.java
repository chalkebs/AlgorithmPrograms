package util;
import java.util.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public final class Utility {

	
	public Utility() {
		
	
	}
	
	public static void Anagram1(String x,String y)
	{
		int i,j,c,d,g=0;
		char temp;
		char[] e = x.toCharArray();
	    char[] f = y.toCharArray();
	    c=e.length;
	    d=f.length;
	    if(c==d)
	    {
	        for(i=0;i<c-1;i++)
	        {
	            for(j=i+1;j<c;j++)
	            {  
	                if(e[i]>e[j])
	                {
	                    temp=e[i];
	                    e[i]=e[j];
	                    e[j]=temp;
	                }  
	            }
	        }
	        for(i=0;i<c-1;i++)
	        {
	            for(j=i+1;j<c;j++)
	            {  
	                if(f[i]>f[j])
	                {
	                    temp=f[i];
	                    f[i]=f[j];
	                    f[j]=temp;
	                }  
	            }
	        }
	        for(i=0;i<c;i++)
	        {
	            if(e[i]==f[i])
	            {
	                g++;
	            }
	        }
	        
	        
	        if(g==c)
	        {
	            System.out.println("Strings are anagram");
	        }
	    
	        else
	        {
	    	System.out.println("strings are not anagram");
	        }
	    }
	}
	
	public static void Prime1()
	{	
		int l,k,c=0;
        for(l=2;l<=1000;l++)
        {
               for(k=2;k<l;k++)
               {
                   if(l%k==0)
                   {
                       c=0;
                       break;
                   }
                   else
                   {
                       c=1;
                   }
               }
               if(c==1)
               {
                   System.out.print(l+",");
               }
         }
	}
	
	
	public static void dayOfWeek(int d, int m, int y) {
		int y0= y-(14 - m) / 12;
		int x = y0 + y0/4 - y0/100 + y0/400;
		int m0 = m + 12 * ((14 - m) / 12) - 2;
		int d0 = (d + x + 31*m0 / 12)%7;
	
		System.out.println("\n0-Sun\n"+"1-Mon\n"+"2-Tues\n"+"3-Wed\n"+"4-Thu\n"+"5-Fri\n"+"6-Sat\n");
		System.out.println(d0);
		
	}

	public static void temperaturConversion(int a) {
		
		Scanner s=new Scanner(System.in);
		double c,f;
		switch(a)
		{
			case 1: System.out.println("Celsius to fahrenheit conversion:");
					System.out.print("Enter input in Celsius:\t");
					c=s.nextDouble();
					f=(c * 9/5) + 32;
					System.out.println("Fahrenheit is:\t"+f);
					break;
					
			case 2: System.out.println("Fahrenheit to Celsius conversion:");
					System.out.print("Enter input in Fahrenheit:\t");
					f=s.nextDouble();
					c=(f - 32) * 5/9;
					System.out.println("Celsius is:\t"+c);
					break;
					
			default: System.out.print("Invalid Input");
					 break;
		}
	}

	public static void monthlyPayment(double Y, double P, double R) 
	{	
		double n=12*Y;
		double r=R/(12*100);
		double c=Math.pow((1+r), n);
		double payment=(P*r)*c;
		double payment1=payment/(c-1);
		System.out.println("Monthly payment="+payment1);
	}

	public static void sqrt(double c) 
	{
		double epsilon=1.0e-15;
		double t=c;
		while(Math.abs(t - c/t) > epsilon*t)
		{
			t=(c/t+t)/2.0;
		}
		System.out.println("Square root of "+c+"is: "+t);	
	}

	public static void binarySearchInt(int[] a1, int low, int high, int a) 
	{
            int mid = (low + high) / 2; 
  
            while(low <= high)
            {
               if(a1[mid]<a)
               {
            	   low=mid+1;
               }
               else if(a1[mid]==a)
               		{
            	   		System.out.println("\nNumber found "+a+" at index "+mid);
            	   		break;
               		}
               else
               {
            	   high=mid-1;
               }
               mid=(low+high)/2;
            }   
            if(low>high)
            {
            	System.out.println("\nNumber not found in integer array...");
            }
  	}
	
	
	public static void binarySearchStr(char[] s2, int low, int high, char str) 
	{
		int mid = (low + high) / 2; 
        while(low <= high)
        {
           if(s2[mid]<str)
           {
        	   low=mid+1;
           }
           else if(s2[mid]==str)
           		{
        	   		System.out.println("\nCharacter found "+str+" at index "+mid);
        	   		break;
           		}
           else
           {
        	   high=mid-1;
           }
           mid=(low+high)/2;
        }   
        if(low>high)
        {
        	System.out.println("\nCharacter not found in string array...");
        }
		
	}

	public static void insertionSortInt(int[] a1, int b3) 
	{
		int i,j,temp;
		for(i=1;i<b3;i++)
		{	
			temp=a1[i];
			j=i-1;
			
			while(j>=0 && a1[j]>temp)
			{
				a1[j+1]=a1[j];
				j=j-1;
			}
			a1[j+1]=temp;
		}
	
		for(i=0;i<b3;i++)
		{
			System.out.print(a1[i]+",");
			System.out.println();
		}
	}

	public static void insertionSortStr(char[] s2, int b2) 
	{
		int i,j;
		char temp;
		for(i=1;i<b2;i++)
		{	
			temp=s2[i];
			j=i-1;
			
			while(j>=0 && s2[j]>temp)
			{
				s2[j+1]=s2[j];
				j=j-1;
			}
			s2[j+1]=temp;
		}
		
		String s7=new String(s2); 
		System.out.print(s7);
		System.out.println();
	}

	public static void bubbleSortInt(int[] a1, int b3) 
	{
		int i,j,temp;
		for(i=0;i<b3-1;i++)
		{
			for(j=i+1;j<b3;j++)
			{
				if(a1[i]>a1[j])
				{
					temp=a1[i];
					a1[i]=a1[j];
					a1[j]=temp;
				}
			}
		}
		System.out.println("\nbubble sorting of integer array...");
		for(i=0;i<b3;i++)
		{
			System.out.print(a1[i]+",");
		}
		
	}

	public static void bubbleSortStr(char[] s2, int b2) 
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
		System.out.println();
		System.out.println("\nbubble sorting of character array...");
		String s5=new String(s2); 
		System.out.print(s5);
	}

	public static void findNumber(int N) 
	{	
		Scanner s=new Scanner(System.in);
		int n=N/2,i;
		int[] a=new int[N];
		for(i=0;i<N;i++)
		{
			a[i]=i;
		}
		System.out.println();
		System.out.println("Think of a number between 0 and "+(N-1));
		System.out.println();
		int low=0,high=N-1;
		int mid = (low + high) / 2; 
        
        while(low <= high)
        {
          System.out.println("1 --> Enter 1 if number is greater than "+mid);
          System.out.println("2 --> or if number is less than "+mid+" enter 0");
          System.out.println("3 --> Otherwise Enter 2...");
          int s1=s.nextInt();
           if(s1==1)
           {
        	   low=mid+1;
        	   if(mid==high-1)
        	   {
        		   System.out.println("Number is: "+high);
        		   System.out.println("Intermediary number is: "+mid);
        		   break;
        	   }
           }
           else if(s1==0)
           		{
           			high=mid-1;
           		    if(mid==low+1)
          	        {
          		        System.out.println("Number is: "+low);
          		        System.out.println("Intermediary number is: "+mid);
          		        break;
          	        }
           		}
           		else if(s1==2)
           			{
           				System.out.println("Number is: "+mid);
           				System.out.println("Intermediary number is: "+mid);
           				break;
           			}
           	mid=(low+high)/2;  
        }
        if(low>high)
        {
        	System.out.println("\nInvalid Number...");
        }
	}

	public static int vm( int N,int i,int c, int[] a) 
	{	
	  if(N==0)
	  {
		return c;  
	  }
	  else
	  {
		if(N>=a[i]) 
		{
			N=N-a[i];
			System.out.println("Note--> "+a[i]);
			c++;
			i=0;
			return vm(N,i,c,a);
		}
		if(N!=0)
		{
			i++;
			return vm(N,i,c,a);
		}
	  }
	return c;
	}

	public static void binarySearchword(String str, ArrayList<String> listOfLines) 
	{
		int w = Collections.binarySearch(listOfLines, str);
        System.out.println("\nWord found at index position "+w+" from Sorted ArrayList");
		
	}

	public static void toBinary(int b) 
	{
		List<Integer> a=new ArrayList<Integer>();
		while(b>0)
		{
			a.add(b%2);
			b=b/2;
		}
		Collections.reverse(a);
		String c = a.toString().replace(",", "").replace("[", "").replace("]", "").trim();
		System.out.println("\n\nBinary format...");
		System.out.print(c);
	}

	public static void swapNibbles(int b) 
	{
		int f=((b&0x0F)<<4|(b&0xF0)>>4);
		toBinary(f);
		System.out.println("\n\nNew no. after swapping nibbles...");
		System.out.print(f);
		
		int g,count;
	    g=f;
	    count=0;
	    
	    while(g!=1)
	    {
	        if(g%2!=0)
	        {
	            count=1;
	            break;
	        }
	        g=g/2;
	    }
	  
	    if(count==0)
	        System.out.println("\n\n"+f+" is a number that is the power of 2...");
	    else
	    	System.out.println("\n\n"+f+" is not the power of 2...");
	}
	
}

