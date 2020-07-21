package by.htp.les2.main;

import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {
		int x;
		int i = 2;
		int fact = 1;
		
		Scanner in = new Scanner(System.in);
        System.out.print("¬ведите натуральное число: ");
        x = in.nextInt();
        in.close();
		
		while (i <= x) {
			fact *= i;
			i++;
		}
		System.out.println(x + "! = " + fact);
	}

}
