import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int number = sc.nextInt();
		int sum = 1;

		if (number >= 1) {
			while (number >1) {
				sum += number;
				number--;
			}
		} else {
			while (number <1) {
				sum += number;
				number++;
			}
		}
			
		System.out.println(sum);
		
			


	}

}
