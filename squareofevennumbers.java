
                           import java.util.*;
                           class squareofevennumbers
                            {

                              public static void main(String[] args)
                               {
                               Scanner sc = new Scanner(System.in);
                                System.out.println("Enter the number");
                              int n=sc.nextInt();
                               
                                int square;
                               for(int i=1;i<=n;i++)
                                   {
                                  if(i%2==0)
                                   {
                                    System.out.println(i);
                                    square = i*i;
                                   System.out.println(" square is =" +square);
                                    }
                                    }
                                  }
                                 }