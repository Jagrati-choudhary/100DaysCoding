import java.util.Scanner;
class NumisPrimeOrNot
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);
System.out.println("enter the number");
int n= sc.nextInt();
int temp=0;
for(int i= 2;i<n;i++)
{
if(n%i==0)
{
temp=1;
break;
}
}
if(temp==0)
System.out. println("number is  prime");
else
System.out.println("number is not prime");
}
}