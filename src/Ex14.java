import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int x = n; x >=1; x--) {
			if ((x%7 == 0) && (x<n)) {
			System.out.println(x);
			}
		}

	}

}
