 /**
*Name:Vrindha e.s.
description:code to print fibonacci
date:12-03-2021
*/

class Fibo{ 
public static void main(String[] args){
int a=0,b=1,c,i=0;
System.out.print(" "+a+" "+b);

while(i<8){
c=a+b;
a=b;
b=c;
i++;
System.out.print(" "+c);
}
}}