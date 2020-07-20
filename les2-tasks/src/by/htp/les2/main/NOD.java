package by.htp.les2.main;

public class NOD {
	
	public static void main(String[] args) {
		int a = 21;
		int b = 33;
		
		System.out.print("NOD of " + a + " and " + b + " is ");
		while (a != b) {
			while (a > b) {
				a = a - b;
			}
			while (b > a) {
				b = b - a;
			}
		}
		System.out.print(a);
	}

}
