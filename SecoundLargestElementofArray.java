                                     import java.util.Scanner;
                                  class SecoundLargestElement{
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
                                            int max=a[0];
                                            int prev=-1;
                                              for(int i=0;i<n;i++){
                                              if(max<a[i]){
                                              prev=max;
                                             max=a[i];
                                            }
                                           else if(a[i]<max && a[i]>prev)
                                                   prev=a[i];
                                           }
                                         System.out.println(prev);
                                          }
                                           }