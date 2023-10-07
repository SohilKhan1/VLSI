package Lecture2;

public class Pattern11 {
	public static void main(String[] args) {
		
		int n = 5;
		
		int row =1;
		int nsp = n-1;
		int nst=1;
		while(row<=n) {
			
			//space 
			for(int i=1;i<=nsp;i++) {
				System.out.print("- ");
			}
			
			//Star
			for(int i=1;i<=nst;i++) {
				if(i%2!=0)
				System.out.print("* ");
				else
				System.out.print("! ");
	
			}
			
			nsp=nsp-1;
			nst=nst+2;
			System.out.println();
			row++;
		}
		
		
		
		
	}

}
