 import java.util.*;
                           class trianglepattren5
                            {

                              public static void main(String[] args)
                               {
                               Scanner sc = new Scanner(System.in);
                                System.out.println("Enter the row");
                                 int row = sc.nextInt();
                                  
                                   for(int i=1;i<=row;i++)
                                      {
                                           for(int j=i; j>=1;j--)
                                          {
                                          System.out.print((char)('a'+j-1)+"");
                                          
                                          }
                                          System.out.print("\n");


                                                }
      }
}