import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N");
		int n = sc.nextInt();
		System.out.println("Enter M");
		int m = sc.nextInt();
		
		int a = (n>m) ? n : m;
		int b = (n>m) ? m : n;
		
		for (int x = a; x >= b; x--) {
			if (x % 50 == 0) {
				System.out.print(x + ", ");
			}
		}

	}

}
