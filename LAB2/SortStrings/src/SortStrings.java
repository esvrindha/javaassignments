/**
*Name:Vrindha e.s.
description:accept an array of String objects and sort in alphabetical order
date:18-03-2021
*/

import java.util.Scanner;
public class SortStrings {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of character in a string");
		String str=sc.nextLine();
		System.out.println("the string you enteres is " +sortStrings( str));
        String lowerCase=str.toLowerCase();
        String upperCase=str.toUpperCase();
			}
	public static String sortStrings(String pstr)
	{
		char temp;char a[]=pstr.toCharArray();
		for(int i=0;i<pstr.length();i++)
		{
			for(int j=i+1;j<pstr.length();j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		
		return new String(a);//changing array to string
	}

}
