package by.htp.les2.main;

public class Task3 {

	public static void main(String[] args) {
		long A = 9_223_372_036_854_775_807L; // 2^63 - 1
		int i = 0;
		char[] greaterMeasures = {' ', 'K', 'M', 'G', 'T', 'P', 'E'};
		
		while (A > 1) {
			System.out.println("A = " + A + ' ' + greaterMeasures[i] + 'b');
			A = A / 1024;
			i++;
		}
	}

}
