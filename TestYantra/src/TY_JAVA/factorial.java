package TY_JAVA;

public class factorial {

	public static void main(String[] args) {
		factorial f= new factorial();
		int result=f.fact(6);
		System.out.println(result);
		}
	public  int fact(int num) {
		int temp=num;
		int prod=1;
		while(temp!=0) {
			prod=prod*temp;
			temp--;
		}
		return prod;
	}

}
