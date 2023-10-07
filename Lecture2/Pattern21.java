package Lecture2;

public class Pattern21 {
	public static void main(String[] args) {
		int n= 5;
		
		int row = 1;
		int nst1=1;
		int nst2=1;
		int nsp=(2*n)-3;
		while(row<=n) {
			
			
			//star
			for(int i=0;i<nst1;i++) {
				System.out.print("* ");
			}
			//space
			for(int i=0;i<nsp;i++) {
				System.out.print("  ");
			}
			//star
			for(int i=0;i<nst2;i++) {
				System.out.print("* ");
			}
			
			nst1++;
			if(row!=n-1)
			nst2++;
			nsp=nsp-2;
			
			
			row++;
			System.out.println();
		}
	}

}
