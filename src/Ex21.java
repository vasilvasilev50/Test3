import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N (1-51)");
		int n = sc.nextInt();

		for (int x = 1; x <= 52; x++) {
			if (x<n) {
				continue;
			}
			int y = (x-1)/4+2;
			switch (y) {
			case 11:
				System.out.print("J ");
				break;
			case 12:
				System.out.print("D ");
				break;
			case 13:
				System.out.print("K ");
				break;
			case 14:
				System.out.print("A ");
				break;
			default:
				System.out.print(y + " ");
				break;
			}
			int z = x % 4;
			switch (z) {
			case 1:
				System.out.print("Spatiq, ");
				break;
			case 2:
				System.out.print("Karo, ");
				break;
			case 3:
				System.out.print("Kupa, ");
				break;
			case 0:
				System.out.print("Pika, ");
				break;
			default:
				System.out.print("?");

			}
		}
	}

}
