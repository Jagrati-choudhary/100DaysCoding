 
                               import java.util.Scanner;

                              class trinagle 

                              {

                             public static void main(String[]args);

                           Scanner sc =new Scanner(System.in);

                         System.out.println("enter the  frist side of triangle T1=");

                          int T1 =sc.nextInt();

                             
                         System.out.println("enter the  frist side of triangle T2=");

                          int T2 =sc.nextInt();
                        
                        
                         System.out.println("enter the  frist side of triangle T3=");

                          int T3 =sc.nextInt();

                          if((T1+T2)>=T3 && (T2+T3)>=T1 && (T3+T1)>=T2)

                          System.out.println("valid");

                        else

                              System.out.println("invalid");

                             }

                        }