                                   import java.util.Scanner;
                                  class MissingNumberofArray{
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
                                         int sum=n*(n+1)/2;
                                          for(int i=0;i<n-1;i++)
                                           {
                                          sum=sum-a[i];
                    
                                           }
                                         System.out.println(sum);
                                            }
                                           }