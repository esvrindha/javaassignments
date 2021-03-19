/**
*Name:Vrindha e.s.
description:displays the number of characters, lines and words in a text
date:18-03-2021
*/

package numberlineswords;
import java.util.Scanner;

public class NumberLinesWords {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter the string");
			String str=sc.nextLine();
			int lineLength=str.split("\\.").length;
			int wordLength=str.split(" ").length+lineLength-1;
			int characterCount=0;
			for(int i=0;i<str.length();i++)
			{
				if(str.charAt(i)!=' '&&str.charAt(i)!='.')
					characterCount++;
					
			}
			System.out.println(lineLength);
			System.out.println(wordLength);
			System.out.println(characterCount);
		
	}
	}
