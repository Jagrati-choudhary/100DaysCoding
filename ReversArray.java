                                  import java.util.Scanner;
                               class ReversArray {
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
                                         System.out.println("Revers Array is =");
                                         for(int i=n-1;i>=0;i--)
                                            System.out.println(a[i]+" ");
                                         }
                                             }