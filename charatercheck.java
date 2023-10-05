


                                
                             import java.util.Scanner;

                              class charatercheck

                             {

                               public static void main(String[]args)

                                 {

                               Scanner sc = new Scanner(System.in);

                                 System.out.println("enter a character ");

                                char ch =sc.nextLine().charAt(0);

                                if(ch>='a' && ch<='z' || ch>='A' &&  ch<='Z')

                                 System.out.println("the character is an alphabet");

                                 else if(ch>='0' && ch<='9')
                                 
                                 System.out.println("the character is a digital");

                                else
                                 
                                 System.out.println("the character is a special character");

                                   }

                              }

                                        