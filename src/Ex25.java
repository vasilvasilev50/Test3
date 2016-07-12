import java.util.Scanner;

public class Ex25 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number N");
		int n = sc.nextInt();
		int x = 1;
		int product = 1;
		
		do {
			product *=x;
			x++;
		} 
		while (x<=n);
		System.out.println(product);
		

	}

}
