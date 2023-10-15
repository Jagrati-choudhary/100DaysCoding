                          import java.util.*;
                           class printthe3series
                            {

                              public static void main(String[] args)
                               {
                               Scanner sc = new Scanner(System.in);
                                System.out.println("Enter the number");
                              int n=sc.nextInt();
                               
                                int series=1;
                                 System.out.print(series+ " ");   
                               for(int i=1;i<=n;i++)
                                   {
                              series= series * 3;
                                   System.out.print(series+ " ");
                                   }
                                 
                                  }
                                 }