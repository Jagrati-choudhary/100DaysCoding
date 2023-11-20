                                      import java.util.Scanner;
                                  class CountSquareofArray{
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
                                          int count=0;
                                         for(int i=0;i<Math.sqrt(n);i++){
                                         int square =i*i;
                                          if(square<n)
                                          count++;
                                         }
                                        System.out.println(count);
                                      }
                                      }