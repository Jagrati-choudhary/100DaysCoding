                                  import java.util.Scanner;
                               class LinerSearchArray {
                                   public static void main(String[] args) {
                                       Scanner sc = new Scanner(System.in);
                                       System.out.println("enter the array element");
                                       int n = sc.nextInt();
                                       int a[] = new int[n];
                                            int   sum=0;
                                          for(int i=0;i<n;i++)
                                         {
                                           System.out.println("a["+i+"]=");
                                            a[i]=sc.nextInt();
                                         }
                                           System.out.println("Check Element");
                                             int check=sc.nextInt();
                                           boolean b=true;
                                              for(int i=0;i<n;i++)
                                                 {

                                                if(a[i]==check)
                                                   {
                                                    System.out.println(check+ "at index "+i);
                                                        b=false;
                                                     }
                                                    }
                                                    if(b)
                                                              System.out.println("Element is not found");
                                                  }
                                                  }

                                                
                                               