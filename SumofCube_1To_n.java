
                           import java.util.*;
                           class SumofCube
                            {

                              public static void main(String[] args)
                               {
                               Scanner sc = new Scanner(System.in);
                                System.out.println("Enter the number");
                              int n=sc.nextInt();
                                
                                int cube;
                                 int sum=0;
                              for(int i=1;i<=n;i++)
                                 {
                                   cube=i*i*i;
                                    sum=sum+cube;
                             }
                          System.out.println("cube of number = " +sum);
                         }
                                }