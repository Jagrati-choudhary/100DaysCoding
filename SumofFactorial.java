import java.util.Scanner;
class  SumofFactorial
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);
System.out.println("enetr the value");
int n=sc.nextInt();
int fact=1;
int sum=0;
for(int i=1;i<=n;i++)
{
fact=fact*i;
sum=sum+fact;
}
System.out.println(" Sum of Factorial is ="+sum);
}
}