import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sum = sc.nextInt();
		
		for (int x = 100; x < 1000; x++) {
			if (((x/100)+(x/10 - (x/100*10))+(x%10)) == sum) {
				System.out.println(x);
			}
		}

	}

}
