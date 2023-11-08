
                                           
                                                              import java.util.Scanner;

                                                             class SumofMultiply_7
                                                             {

                                                             public static void main(String[]args)

                                                              {
                                                                 Scanner sc = new Scanner(System.in);
                                                                 System.out.println("Enter the num");
                                                                       int n=sc.nextInt();

                                                                                int sum=0;

                                                               for(int i=1;i<=n;i++){
                                                                if(i%7 == 0){
                                                               sum = sum + i;
                                                                   

                                                                 
                                                            }
                                                        }
                                                           System.out.println("sum = " +sum);

                                                               }

                                                            }