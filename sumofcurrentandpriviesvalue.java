
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
                                do
                                   {
                                      System.out.println(sum);
                                     sum = sum + i;
                                        System.out.println(" "+i+" ="   +sum);
                                        i++;
                                     }while(i<=n);
                                  
                                     }
                                      }