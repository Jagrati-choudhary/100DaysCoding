
                                      import java.util.*;
                           class printpriemnthnumber
                            {

                              public static void main(String[] args)
                               {
                               Scanner sc = new Scanner(System.in);
                                System.out.println("Enter the number");
                              int n=sc.nextInt();
                              int count = 0,num =2;
                               
                                boolean prime = true;
                              while(count<n)
                                  {
                                  for(int j = 2;j<=num/2;j++)
                                  {
                                      if(num%j ==0)
                                    {
                                            prime = false;
                                           break;
                                }
                                    }
                                  if(prime)
                                  {
                                     count++;
                                    }
                                   num++;
                                    prime = true;
                                   }
                            System.out.println(n+"th prime numbers is ="+  --num);
                                }
                             }