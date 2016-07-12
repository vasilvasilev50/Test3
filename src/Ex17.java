import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter b");
		int b = sc.nextInt();
		
		char sign = '+';
		
		for (int x = 1; x <=b; x++) {
			for (int y =1; y<=b; y++) {
				if ((x==1)||(x==b)) {
					System.out.print("* ");
				} else {
					if ((y==1)||(y==b)) {
						System.out.print("* ");
					} else {
					System.out.print(sign+" ");
					}
				}
				
			}
			System.out.println();
		}

	}

}
