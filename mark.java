
                          import java.util.Scanner;
                             class mark
                                {
                             public static void main(String[]args)
                               {
                                 Scanner input1 = new Scanner(System.in);

                               System.out.println("please enter the english subject mark");

                                double englishmark = input1.nextDouble();

                                System.out.println("please enter the hindi subject mark");

                                          double hindimark = input1.nextDouble();
                                  
                               System.out.println("please enter the maths subject mark");
                              
                                         double mathsmark = input1.nextDouble();
                                  
                                 if(englishmark>=75)
                                          System.out.println("Hey you have got distintin english "+englishmark);

                                          if(hindimark>=75)
                                          System.out.println("Hey you have got distintin hindi"+hindimark);

                                         if(mathsmark>=75)
                                          System.out.println("Hey you have got distintin maths "+mathsmark);
                                      }
                                    }