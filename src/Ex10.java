import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		boolean prosto = true;
		
		for (int y = 2; y <= x/2; y++) {
			
			if (x % y == 0) {
				prosto = false;
				break;
			} else {
				prosto = true;
				
			}
			
		}
		System.out.println(prosto);
		if (prosto == true) {
			System.out.println("Prosto e");
		} else {
			System.out.println("Ne e prosto");
		}



	}

}
