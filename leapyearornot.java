

                               import java.util.Scanner;

                             class leapyearornot

                               {

                                public static void main(String[]args)

                                  {

                              Scanner sc = new Scanner(System.in);

                                 System.out.println("Enter the year");

                                int year = sc.nextInt();

                               if(year%4 == 0)

                                         System.out.println("Year is leap year");

                                    else

                                            System.out.println("Year is not leap year");

                                  }

                                }