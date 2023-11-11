               import java.util.Scanner;

                 class CountSmallerElementofArray{
               	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		int[] a = new int[n];


		for(int i=0; i<n; i++) {
			System.out.print("a["+i+"]=");
			a[i] = sc.nextInt();
		}	
                     System.out.println("Smaller Number ");
                     int s=sc.nextInt();
		int count = 0;
		for(int i=0; i<n; i++) {
			if(a[i]<=s){
				count++;
			}
		}
			System.out.print("Small Element of Array =  "+count);


                      }
                      }