
public class Ex18 {

	public static void main(String[] args) {

		int a = 4;
		int b = 4;

		for (int x = 1; x <= a * b; x++) {

			int y = (x + (a - 1)) / a;
//			System.out.print(y);

			int z = x%a;
			if (z==0) {
				z=a;	
			}
//			System.out.println(z);
			
			System.out.println(y+"*"+z+" = "+y*z);

		}

	}

}
