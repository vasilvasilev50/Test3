import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number");
		int number1 = sc.nextInt();
		System.out.println("Enter second number");
		int number2 = sc.nextInt();
		
		if (number1 < number2) {
			while (number1 <= number2 ) {
				System.out.println(number1);
				number1++;
			}
		} else {
			while (number2 <= number1) {
				System.out.println(number2);
				number2++;
			}
		}
		
		
	}

}
