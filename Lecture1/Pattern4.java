package Lecture1;

public class Pattern4 {
	public static void main(String[] args) {
		int n= 5;
		int row =1;
		int nsp =n-1;
		int nst = 1;
		while(row<=n) {
			
			//Space
			for(int i = 1;i<=nsp;i++) {
				System.out.print("- ");
			}
			//Star
			for(int i=1 ;i<=nst;i++) {
				System.out.print("* ");
			}
			nsp--;
			nst++;
			row++;
			System.out.println();
		}
	}

}
