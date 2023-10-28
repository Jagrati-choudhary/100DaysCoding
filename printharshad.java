                            import java.util.*;  
                            class printharshad
                                   {

                               public static void main(String[]args)
                           {
                             Scanner sc= new Scanner(System.in);
                             System.out.println("enetr the number");
                             int num=sc.nextInt();
                            
                               int sum=0;
                                 int rem=0,n;
                             
                                  n=num;
                                    while(num>0){
                                   rem=num%10;
                                      sum=sum+rem;
                                    num=num/10;
                              }
                                     if(n%sum==0)
                                       System.out.println("yes");
                                        else
                                      System.out.println("no");
                                   }

                                }