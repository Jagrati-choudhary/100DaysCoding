                                  import java.util.Scanner;
                               class SwapkthElementofArray {
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
                                          int temp;
                                         System.out.println("Enter the kth Element");
                                          int kth=sc.nextInt();
                                          temp=a[kth-1];
                                          a[kth-1]=a[n-kth];
                                           a[n-kth]=temp;
                                                System.out.println();
                                           for(int i=0;i<n;i++)
                                            System.out.println(a[i]+" ");
                                              }
                                                   }   