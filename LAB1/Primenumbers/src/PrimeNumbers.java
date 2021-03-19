
/**
*Name:Vrindha e.s.
description: Printing prime numbers till a limit
date:12-03-2021
*/
import java.util.Scanner;
class Prime{
	public static void main(String[] args) 
	{
		
		String primeNumbers="  ";
		int i=0;
		int num=0;
		
		System.out.println("Enter the number up to which you have to print prime numbers : ");
		
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		 
		for(i=1;i<=n;i++)
		{
			int counter=0;
				for(num=i;num>=1;num--)
				{
					if(i%num==0)
					{
						counter=counter+1;
					}
		         }
		if(counter==2)
			{
				primeNumbers=primeNumbers + i +" ";
			}
	
		}
	System.out.println("prime numbers up to "+n+" are:"+primeNumbers);

}
}