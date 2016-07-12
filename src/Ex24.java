import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number N ([10-30000])");
		int n = sc.nextInt();
		
		int a = n/10000;
		int b = n/1000-(a*10);
		int c = n/100-(a*100+b*10);
		int d = n/10-(a*1000+b*100+c*10);
		int e = n%10;
		
		if (a!=0) {
			if (a==e) {
				if (b==d) {
					System.out.println("Chisloto e palindrom");
				} else {
					System.out.println("Chisloto ne e palindrom");
				}
			} else {
				System.out.println("Chisloto ne e palindrom");
			}			
		} else {
			if (b!=0) {
				if (b==e) {
					if (c==d) {
						System.out.println("Chisloto e palindrom");
					} else {
						System.out.println("Chisloto ne e palindrom");
					}
				} else {
					System.out.println("Chisloto ne e palindrom");
				}
			} else {
				if (c!=0) {
					if (c==e) {
						System.out.println("Chisloto e palindrom");
					} else {
						System.out.println("Chisloto ne e palindrom");
					}
				} else {
					if (d==e) {
						System.out.println("Chisloto e palindrom");
					} else {
						System.out.println("Chisloto ne e palindrom");
					}
				}
			}
		}
		
		
//		Получи се доста сложно и дълго! C "do-while" не можах да измиля как да стане :(.
//		Ще се радвам ако ми подскажеш :)
		
		

	}

}
