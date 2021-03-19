/**
*Name:Vrindha e.s.
description:method to create the mirror image of a String
date:18-03-2021
*/

package mirrorimage;
import java.util.Scanner;

public class MirrorImage {
	public static void main(String[] args)
	{    Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.next();
		System.out.println(getMirrorString(str));
	    
	}
 private static String getMirrorString(String pStr)
 {
 	StringBuffer reverseStr=new  StringBuffer(pStr);
 	reverseStr.reverse();
 	return pStr+"|"+reverseStr;
 
 }


	}
