package Lecture2;

public class Pattern17 {
	public static void main(String[] args) {
		int n= 7;
		int row =1;
		
		int nst1=3;
		int nsp=1;
		int nst2=3;
		
		while(row<=n) {
			
			//Star
			for(int i=1;i<=nst1;i++) {
				System.out.print("* ");
			}
			//Space
			for(int i=1;i<=nsp;i++) {
				System.out.print("- ");
			}
			//Star
			for(int i=1;i<=nst2;i++) {
				System.out.print("* ");
			}
			
			if(row<=n/2) {
				nst1--;
				nst2--;
				nsp=nsp+2;
			}else {
				nst1++;
				nst2++;
				nsp=nsp-2;
			}
			
			
			
			
			row++;
			System.out.println();
		}
	}

}
