package Lecture2;

public class Pattern14 {
	public static void main(String[] args) {
		int n= 5;
		
		int row =1;
		int trow=(2*n)-1;
		int nst =1;
		int nsp = n-1;
		while(row<=trow) {
			
			//Space 
			for(int i=1;i<=nsp;i++) {
				System.out.print("  ");
			}
			
			//star
			for(int i=1;i<=nst;i++) {
				System.out.print("* ");
			}
			if(row<n) {
			nst=nst+1;
			nsp=nsp-1;
			}
			else {
			nst=nst-1;
			nsp=nsp+1;
			}  

			
			row++;
			System.out.println();
		}
	}

}
