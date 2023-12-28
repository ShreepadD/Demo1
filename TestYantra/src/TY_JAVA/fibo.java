package TY_JAVA;

public class fibo {
	public static void main(String[] args) {
		int range=7;
		int firstTerm=0;
		int SecondTerm=1;
		System.out.print(firstTerm+" "+SecondTerm+" ");
		for(int i=2;i<range;i++) {
			int nextNum= firstTerm+SecondTerm;
			System.out.print(nextNum+" ");
			firstTerm=SecondTerm;
			SecondTerm=nextNum;
		}
	}
}
