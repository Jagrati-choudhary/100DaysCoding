class Factorial_1To_5
{
public static void main(String[]args)
{
int fact=1;
for(int i=1;i<=5;i++)
{
fact=fact*i;

System.out.println("Factorial of "+i+" =" +fact);
}
}
}