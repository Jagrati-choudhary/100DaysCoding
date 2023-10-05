

                             import java.util.Scanner;

                              class companybonus

                             {

                               public static void main(String[]args)

                                 {

                               Scanner sc = new Scanner(System.in);

                                 System.out.println("enter the year of joining");

                                  int year = sc.nextInt();

                             if (year>=5)

                            {

                             System.out.println("enter the employee's salary");

                              int salary = sc.nextInt();

                               System.out.println("your bonus amount is =" +(salary*5)/100);

                               }

                           else

                                 System.out.println("sorry ,ypu are not eligible for a bonus ");

                                  }

                                }