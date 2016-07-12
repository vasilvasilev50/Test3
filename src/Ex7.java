import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entern n:");
		int n = sc.nextInt();
		
		for (int x = 3; x <= (3*n); x++) {
			if (x % 3 == 0) {
				System.out.println(x);
			}
		}

	}

}
