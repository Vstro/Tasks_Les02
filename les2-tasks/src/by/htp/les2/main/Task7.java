package by.htp.les2.main;

public class Task7 {

	public static void main(String[] args) {
		double a = 78.9;
		double b = 9.3;
		double c = -34.5;
		int counter = 0;
		
		if (a < 0) {
			counter++;
		}
		if (b < 0) {
			counter++;
		}
		if (c < 0) {
			counter++;
		}
		System.out.println("Количество отрицательный среди чисел " + a + ", " + b + " и " + c + ": " + counter);
	}

}
