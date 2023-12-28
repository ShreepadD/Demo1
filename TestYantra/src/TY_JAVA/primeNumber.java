package TY_JAVA;

public class primeNumber {

	public static void main(String[] args) {
		 int num=19;
		 boolean flag=true;
		 for(int i=2;i<num;i++) {
			 if(num%i==0) {
				 flag=false;
			 }
		 }
		 if(flag==true) {
			 System.out.println("Number is Prime");
		 }
		 else {
			 System.out.println("Number is composite");
		 }
	}

}
