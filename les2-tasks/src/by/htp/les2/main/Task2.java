package by.htp.les2.main;

public class Task2 {

	public static void main(String[] args) {
		double a = 2;
		double b = 6;
		double c = 4;
		double d = 3;
		
		if (c == 0 || d == 0) {
			System.out.print("������ ������ �� ����!");
		}
		else {
			double rez = a/c*b/d - (a*b - c)/c/d;
			System.out.print("���������: " + rez);
		}
	}

}
