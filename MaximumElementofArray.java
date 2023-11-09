 import java.util.Scanner;

class MiximumElementofArray{
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		int[] a = new int[n];


		for(int i=0; i<n; i++) {
			System.out.print("a["+i+"]=");
			a[i] = sc.nextInt();
		}
		int max = a[0];
		for(int i=1; i<n; i++) {
			if(max<a[i]) {
				max=a[i];
			}
		}
			System.out.print("Miximum element =  "+max);


}
}