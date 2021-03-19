/**
*Name:Vrindha e.s.
description: sum of the cubes of digits
date:12-03-2021
*/

package sumOfCubeofdigits;
import java.util.Scanner;

class SumOfCubeOfDigits

{
			public static void sumOfCubedDigits(int num) {
				int number=num;
				int sum=0,rem=0;
				while(number!=0) {
					rem=number%10;
					number=number/10;
					sum=sum+(rem*rem*rem);
				}
				System.out.println(sum);
		}
			public static void main(String[] args) {
				Scanner sc =new Scanner(System.in);
				System.out.println("Enter a number");
				int number=sc.nextInt();
				sumOfCubedDigits(number);		
				}
}
