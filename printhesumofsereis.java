                             import java.util.*;
                           class Sample
                            {

                              public static void main(String[] args)
                               {
                               Scanner sc = new Scanner(System.in);
                                System.out.println("Enter the number");
                              int n=sc.nextInt();
                                 int i=1;
                                int sum =0;
                                    int t=0;
                                do
                                   {
                                      t= t*10 +2;
                                      
                                         
                                      System.out.println(t);
                                     if(i<n)
                                   {
                                          System.out.println(" + ");
                                       }
                                         sum=sum+t;
                                        i++;
                                     }while(i<=n);
                                       System.out.println(sum);
                              
                                     }
                                    }