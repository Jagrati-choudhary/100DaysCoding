                                  import java.util.Scanner;
                               class NextSmallerElementofArray {
                                   public static void main(String[] args) {
                                       Scanner sc = new Scanner(System.in);
                                       System.out.println("enter the array element");
                                       int n = sc.nextInt();
                                        
                                       int a[] = new int[n];
                                        
                                          for(int i=0;i<n;i++)
                                         {
                                           System.out.println("a["+i+"]=");
                                            a[i]=sc.nextInt();
                                            
                                           }
                                       for(int i=0;i<n-1;i++)
                                   {
                                              if(a[i]>a[i+1])
                                        System.out.println(a[i+1]+" ");
                                   else
                                         
                                       System.out.println("-1");
                                      }
                                         System.out.println("-1");
                                   }
                                } 