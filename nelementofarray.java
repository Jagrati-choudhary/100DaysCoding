
                            import java.util.Scanner;
                               class Nelementofarray
                             {
                                public static void main(String[]args)
                              {
                              Scanner sc = new Scanner(System.in);
                                System.out.println("enter the array element");
                                int n=sc.nextInt();
                                int a[]=new int [n];
                               
                                 System.out.print("[");
                                  for (int i=0;i<n;i++)
                                  {
                                    System.out.print(i);
                                     if(i<n-1){
                                       System.out.print(",");
                                    
                                    }
                                      
                                      }
                                       System.out.println("]");
                                 }
                                }