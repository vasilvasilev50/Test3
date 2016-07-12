
public class Ex12 {

	public static void main(String[] args) {
		
		for (int x = 100; x <= 1000; x++) {
			if ((x/100 == x%10)||((x/10 - (x/100*10))==x/100)||((x/10 - (x/100*10))==x%10)) {
				continue;
			}
			System.out.println(x);
		} 
		

	}
}