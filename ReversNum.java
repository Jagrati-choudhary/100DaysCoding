import java.util.Scanner; 
class ReversNum
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);
System.out.println("enetr the value");
int n= sc.nextInt();

int rev=0;

for(int i=0;i<=n;i++)
{
rev=rev*10+n%10;
n=n/10;
}
System.out.println(+rev);

}
}
