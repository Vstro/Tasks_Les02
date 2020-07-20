package by.htp.les2.main;

public class Task11 {

	public static void main(String[] args) {
		double a = -10;
		double b = 10;
		double h = 0.1;
		double x = a;

		while (x < b || Math.abs(b - x) < h) {
			if (x > 2) {
				System.out.println("y = " + x);
			} else {
				System.out.println("y = " + (-x));
			}
			x = x + h;
		}
	}

}
