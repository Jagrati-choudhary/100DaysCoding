                                 import java.util.Scanner;
                               class Left_1_PositionRotation {
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
                                        int temp=a[n-1];
                                        for(int j=n-1;j>=1;j--){
                                         a[j]=a[j-1];
                         
                                        }
                                           a[0]=temp;
                                            for(int k=0;k<n;k++){
                                           System.out.println("a["+k+"]="+a[k]);
                                      }
                                      
 
                                   }
                               }
                                  