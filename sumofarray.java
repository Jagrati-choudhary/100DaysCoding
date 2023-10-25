                                  import java.util.Scanner;
                               class sumofarray {
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
                                         
                                            sum = sum+a[i];
                                             }
                                        System.out.println(sum);
                                            }
                                           }