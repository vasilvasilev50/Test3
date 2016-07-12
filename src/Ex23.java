
public class Ex23 {

	public static void main(String[] args) {
		
		for (int x = 1; x<=9; x++) {
			
			for (int y = 1; y<=9; y++) {
				if (x>y) {
					continue;
				}
				System.out.print(x+"*"+y+"; ");
				
			}
			System.out.println();
		}

	}

}
