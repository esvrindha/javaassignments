/**
*Name:Vrindha e.s.
description:program shows message based on the input provided by the user 
date:14-03-2021
*/
import java.util.Scanner;
class Trafficlights {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=sc.nextInt();
		String message;
		switch(number) {
		case 1: message ="STOP";
		        break;
		case 2: message="GO";
		        break;
		case 3: message = "READY";
		        break;
		default: message ="INCORRECT selection";
		        break;
				
		}
		System.out.println(message);
		}
		

	}
