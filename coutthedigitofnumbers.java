                              import java.util.*;
                                 class coutthedigitofnumbers
                              {

                              public static void main(String[] args)
                               {
                               Scanner sc = new Scanner(System.in);
                                System.out.println("Enter the number");
                              int n=sc.nextInt();
                            int digit = 0;
                              int sum =0;
                                int t;
                               while(n!=0)
                                   {
                                      t=n%10;
                                     sum  = sum + t;;
                                        n= n/10;
                                     ++digit;
                                    }
                                    System.out.println(" number of digit =" +digit);
                                      System.out.println("  sun of number of =" +sum);  
                                    
                                      }
                                     }