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
                                       if(i%2!=0)
                                        {
                                       System.out.println(i);
                                     
                                     sum = sum + i;
                                       }
                                   
                                       i++;
                                     }while(i<=n);
                                        System.out.println( "sum of odd numbers =" +sum);
                                     }
                                      }