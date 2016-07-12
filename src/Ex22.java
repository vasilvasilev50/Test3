import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number from 1 to 999 ");
		int n = sc.nextInt();
		
		int x = n;
		int y = 1;
		
		while (x<=999) {
			if (((x%2==0)||(x%3==0)||(x%5==0))&&(x>n)) {
				System.out.print(y+":");
				System.out.print(x+", ");
				y++;
				if (y==11) {
					break;	
				}
			}
			x++;
		}

	}

}
