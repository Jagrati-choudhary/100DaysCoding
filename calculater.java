
                                      import java.util.Scanner;
                                      class calculater

                                      {

                                       public static void main(String[]args)

                                       {

                                        Scanner sc = new Scanner(System.in);

                                         System.out.println(" Enetr  the frist value");
                                        int a = sc.nextInt();

                                           System.out.println(" Eneter the secound value");
                                        int b = sc.nextInt();

                                        System.out.println(" 1)    Addition");
                                        System.out.println(" 2)    subraction");
                                         System.out.println(" 3)   multiply");
                                           System.out.println(" 4)  Division");
                        
                                        System.out.println(" Enetr your choice");
                                        int choice = sc.nextInt();
                                          float c;

                                        switch(choice)
                                          {
                                              case 1:
                                                    int c = a+b;
                                                  System.out.println("a+b:"+c);
                                                   break;
                                           case 2:
                                                    int c = a-b;
                                                  System.out.println("a-b:"+c);
                                                      break;
                                           case 3:
                                                    int c= a*b;
                                                  System.out.println("a+*b:"+c);
                                                    break;
                                           case 4:
                                                    int c= a/b;
                                                  System.out.println("a/b:"+c);
                                                       break;
                                           
                                         default :

                                                  System.out.println("sorry rong choice");
                                                }
                                        }

                                      }













                                           
                                            