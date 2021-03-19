/**
*Name:Vrindha e.s.
description:reads a line of integers and then displays each integer and the sum of all integers
date:18-03-2021
*/
package stringtokenizer;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Tokenizer {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the integers with space:");
		String line=sc.nextLine();
		StringTokenizer st=new StringTokenizer(line);
		int sum=0,i=1;
		while(st.hasMoreTokens())
		{
			int n=0;
			n=Integer.parseInt(st.nextToken());
			System.out.println("number " +n);
			sum=sum+n;
		}
		System.out.println("sum"+sum);
		

	}

}
