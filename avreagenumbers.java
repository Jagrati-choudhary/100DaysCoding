

                                 
                                                             import java.util.Scanner;

                                                             class avreagenumbers

                                                             {

                                                             public static void main(String[]args)

                                                              {

                                                                Scanner sc = new Scanner(System.in);
                                                                System.out.println("Enter the avreage number");

                                                                int number = sc.nextInt();
                                                                 int avreage = 0;

                                                               for(int i=1;i<=number;i++){
                                                               avreage = avreage +i;
                                                                   }

                                                                   System.out.println(" Avreage numbers is =" +(avreage/number));
                                                              }
                                                             }