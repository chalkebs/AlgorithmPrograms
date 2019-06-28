package util;
import java.util.*;
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

}

