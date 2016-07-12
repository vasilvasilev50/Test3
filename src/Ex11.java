import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter N");
		int n = sc.nextInt();

		for (int x = 1, z = n; x <= n; x++, z--) {
			for (int y = 1; y < n * 2; y++) {
				if (y < n) {
					if (z > y) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				} else {
					if (x > (y - n)) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}

			}
			System.out.println();
		}

		for (int x = 1, z = n; x <= n; x++, z--) {
			for (int y = 1; y < n * 2; y++) {
				if (y <= n) {
					if ((z != y)&&(z!=1)) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				} else {
					if ((x != (y - (n-1)))&&(x!=n)) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				}

			}
			System.out.println();
		}
	}

}
