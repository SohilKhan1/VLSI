package Lecture1;

public class Pattern3 {
	public static void main(String[] args) {
		int n= 5;
		int row = 1;
		int nst = 5;
		while(row<=n) {
			
			for(int i=1;i<=nst;i++) {
				System.out.print("* ");
			}
			nst=nst-1;
			row++;
			System.out.println();
		}
	}

}
