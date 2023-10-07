package Lecture1;

public class Pattern10 {
	public static void main(String[] args) {
		int n = 5;
		int row = 1;

		int nsp = 0;
		int nst = (2 * n) - 1;

		while (row <= n) {

			// Space
			for (int i = 1; i <= nsp; i++) {
				System.out.print("  ");
			}

			// Star
			for (int i = 1; i <= nst; i++) {
				System.out.print("* ");
			}

			nst=nst-2;
			nsp++;
			row++;
			System.out.println();
		}
	}
}
