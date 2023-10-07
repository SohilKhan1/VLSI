package Lecture2;

public class Pattern13 {
	public static void main(String[] args) {
		int n= 5;
		
		int row =1;
		int trow=(2*n)-1;
		int nst =1;
		while(row<=trow) {
			
			//star
			for(int i=1;i<=nst;i++) {
				System.out.print("* ");
			}
			if(row<n)
			nst=nst+1;
			else
			nst=nst-1;
			
			row++;
			System.out.println();
		}
	}

}
