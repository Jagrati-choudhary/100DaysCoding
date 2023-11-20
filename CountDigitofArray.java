                                      import java.util.Scanner;
                                  class CountDigitofArray{
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
                                          int temp=n;
                                             int count=0;
                                              while(temp!=0)
                                           {
                                            int c=temp%10;
                                              temp=temp/10;
                                              if(c>0 && n%c==0)
                                                count++;
                                           }
                                           System.out.println(count);
                                          }
                                           }
