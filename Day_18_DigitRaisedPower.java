                             import java.util.*;
                                 class Day_18_DigitRaisedPower
                              {

                              public static void main(String[] args)
                               {
                               Scanner sc = new Scanner(System.in);
                                System.out.println("Enter the number");
                              int n=sc.nextInt();
                             int d,digit=0;;
                             int revers = 0;
                                int cube;
                               while(n!=0)
                                   {
                                      d=n%10;
                                     revers  = revers*10+d;
                                        n= n/10;
                                       ++digit;
                                    }
                                        System.out.println("Number of digit " +digit);
                                          System.out.println("digit raised to the power is  " +digit);
                                           for(int i=1;i<=digit;i++)
                                         {
                                        d= revers%10;
                                           int res=1;
                                         for(int j=1;j<=digit;j++)
                                        {
                                           res=res*d;
                                        }
                                            revers=revers/10;
                                             System.out.println(res);
                                      }
                                     }
}