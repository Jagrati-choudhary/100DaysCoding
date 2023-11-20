                               import java.util.Scanner;
                               class NumberofOccurance{
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
                                        System.out.println("enter the number");
                                        int x=sc.nextInt();
                                             int occ=0;
                                             for(int i=0;i<n;i++)
                                         {
                                             if(a[i]==x)
                                              occ++;
                                         }
                                       System.out.println(occ);
                                      }
                                      }