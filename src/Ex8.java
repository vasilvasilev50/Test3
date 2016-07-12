import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n:");
		int n = sc.nextInt();
		
		for (int x = 1, z = (n-1); x <= n; x++, z+=2) {
			for (int y = 1; y <= n; y++) {
				System.out.print(z);
				
			}
			System.out.println();
			
		}

	}

}
