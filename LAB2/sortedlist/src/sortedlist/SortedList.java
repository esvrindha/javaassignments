/**
*Name:Vrindha e.s.
description:Sorting list of products
date:-15-03-2021
*/

package sortedlist;
import java.util.Scanner;
public class SortedList {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter the number of items:");
		final int NUM_ITEMS=sc.nextInt();
		System.out.print("Enter the elements of array(seperated by space)");
		int [] arr=new int[NUM_ITEMS];
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();


		int temp;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i:arr)
		  System.out.println(i);

	}


	}

