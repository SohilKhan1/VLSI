package Lecture1;

public class Pattern1 {
	public static void main(String[] args) {
		int n = 5;
		int row = 1;

		while (row <= n) {

			for (int i = 1; i <= 5; i++) {
				System.out.print("* ");
			}
			row++;
			System.out.println();

		}
	}
}
