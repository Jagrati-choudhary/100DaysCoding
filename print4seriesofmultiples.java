                          import java.util.*;
                           class print4seriesofmultiples
                            {

                              public static void main(String[] args)
                               {
                               Scanner sc = new Scanner(System.in);
                                System.out.println("Enter the number");
                              int n=sc.nextInt();
                               
                                int power = 1;
                                System.out.print(power+ " ");   
                               for(int i=1;i<=n;i++)
                                   {
                              power= power + 4;
                                   System.out.print(power+ " ");
                                   }
                                 
                                  }
                                 }