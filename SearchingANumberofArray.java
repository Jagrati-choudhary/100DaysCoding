                                 import java.util.Scanner;
                               class SearchingANumberofArray {
                                   public static void main(String[] args) {
                                       Scanner sc = new Scanner(System.in);
                                       System.out.println("enter the array element");
                                       int n = sc.nextInt();
                                        
                                       int a[] = new int[n];
                                      ;
                                          for(int i=0;i<n;i++)
                                         {
                                           System.out.println("a["+i+"]=");
                                            a[i]=sc.nextInt();
                                          }
                                         System.out.println("Enter a number");
                                           int k=sc.nextInt();
                                         boolean b=false;
                                           int temp=0;
                                             for(int i=0;i<n;i++)
                                                {
                                                 if(a[i]==k){
                                                temp=a[i+1];
                                                b=true;
                                                   break;
                                                }
                                            }
                                             if(b)
                                                 System.out.println(temp);                    
                                              else
                                                  System.out.println("-1");
                                                }
                                             }