                 import java.util.*;
                 class NumisGoodorBad
                   {
	             public static boolean isPrime(int no)
	             {
		   if(no<2)
		     return false;
		     for(int i=2;i<no;i++)
		       {
		       if(no%i==0)
			  return false;
		          }
		           return true;
	                }
	                public static void main(String[] args)
	                 {
	                   Scanner sc=new Scanner(System.in);
                           System.out.println("enetr the number");	
                           int number=sc.nextInt();
		           int rev=0;
		           int size=0;
		           while(number>0)
		             {
		              rev=rev*10+number%10;	
		              number=number/10;
		                 size++;
		                 }
		            
		              boolean flag=true;
		                  for(int i=0;i<size;i++)
		              {
		             	int temp=rev%10;
			      rev=rev/10;
			      if(i%2==0)
			    {
			     if(temp%2!=0)
                            if(i%2==0)
			  {
			   if(temp%2!=0)
				flag=false;
			  }
                               }
			    else 
			   {
				if(!isPrime(temp))
				  flag=false;
			  }
			
		              }
		             if(flag==true)
			         System.out.println("Good Number");
		           else 
		             	System.out.println("Not a Good number");

	                       }
                                  }
                               
