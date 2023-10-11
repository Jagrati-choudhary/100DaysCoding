                        import java.util.*;
                           class pattren10
                            {

                              public static void main(String[] args)
                               {
                               Scanner sc = new Scanner(System.in);
                                System.out.println("Enter the row");
                                 int row = sc.nextInt();
                                  System.out.println("Enter the col");
                                 int col = sc.nextInt();
                                 int    counter = row*col;
                                   for(int i=5;i>=row;i--)
                                      {
                                           for(int j=5; j>=col;j--)
                                          {
                                          System.out.print(counter+"");
                                          counter = counter+1;
                                          }
                                          System.out.print("\n");


                                                }
      }
}