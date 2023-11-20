                                 import java.util.Scanner;
                                  class PalindromicArray{
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
                                          int palin=1;
                                              for(int i=0;i<n;i++){
                                               int temp=a[i];
                                                int revers=0;
                                               while(temp!=0){
                                                revers=revers*10+temp%10;
                                                   temp=temp/10;
                                              }
                                              if(revers!=a[i]){
                                                   palin=0;
                                                       break;
                                                  }
                                              }
                                               System.out.println(palin);
                                          }
                                            }