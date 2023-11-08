import java.util.Scanner;
class NumberAreStrong
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int n=sc.nextInt();
int tem,remin,sum=0,i,fact;
tem=n;
while(tem>0){
fact=1;
i=1;
remin=tem%10;
while(i<=remin)
{
fact=fact*i;
i++;
}
sum=sum+fact;
tem=tem/10;
}

if(n==sum)
System.out.println("Number is strong");
else
System.out.println("Number is not strong");


}
}
