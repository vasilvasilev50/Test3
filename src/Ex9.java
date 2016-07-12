import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A");
		int a = sc.nextInt();
		System.out.println("Enter B");
		int b = sc.nextInt();
		int sum = 1;

		int x = (a<b) ? a : b;
		int y = (a>b) ? a : b;

		for (int z = x; x <= y; x++) {
			if (x * x % 3 == 0) {
				System.out.print("skip " + x * x + ", ");
				continue;
			}
			System.out.print(x * x + ", ");
			sum += x * x;
			if (sum > 200) {
				break;
			}

		}

	}

}
