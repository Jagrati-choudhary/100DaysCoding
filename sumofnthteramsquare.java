
                           import java.util.*;
                           class sumofnthtreamsquare
                            {

                              public static void main(String[] args)
                               {
                               Scanner sc = new Scanner(System.in);
                                System.out.println("Enter the number");
                              int n=sc.nextInt();
                                 int i=1;
                                int square;
                                 int sum=0;
                                do
                                   {
                                     square = i*i;
                                    System.out.println("i  is  =" +square);
                                      sum =sum+i;
                                      System.out.println(sum);
                                    i++;
                                        
                                      
                                     }while(i<=n);

                                     }
                                      }