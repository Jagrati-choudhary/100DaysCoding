                                 import java.util.Scanner;
                               class CompeteTheSkills {
                                   public static void main(String[] args) {
                                       Scanner sc = new Scanner(System.in);
                                       System.out.println("enter the array element");
                                       int n = sc.nextInt();
                                        
                                       int a[] = new int[n];
                                        int b[]=new int[n];
                                          for(int i=0;i<n;i++)
                                         {
                                           System.out.println("a["+i+"]=");
                                            a[i]=sc.nextInt();
                                            
                                           System.out.println("b["+i+"]=");
                                            b[i]=sc.nextInt();
                                         }
                                           int acount=0;
                                         int bcount=0;
                                         for(int i=0;i<n;i++)
                                            {
                                         if(a[i]>b[i])
                                             acount++;
                                          else if(a[i]<b[i])
                                                 bcount++;
                                       }
                                      System.out.println(acount);
                                            System.out.println(bcount);
                                           }
                                         }         