import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		int x = 1;
		do {
			sum += x;
			x++;
		} 
		while (x <= n);
		
		System.out.println(sum);
	}

}
