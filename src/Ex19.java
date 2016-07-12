
public class Ex19 {

	public static void main(String[] args) {
		
		int x = 11;
		
		int y = (x%2==0) ? (x/2) : (x*3+1);
//System.out.println(y);
		
		while (y>=1) {
			if (y % 2 ==0) {
				System.out.print(y+" ");
				y = y/2;
			} else {
				System.out.print(y+" ");
				y = y*3+1;
			}
			if (y==1) {
				System.out.println(y);
				break;
			}
		}

	}

}
