package TY_JAVA;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your number");
		int num= sc.nextInt();
		int temp=num;
		int strong=0;
		
		while(temp!=0) {
			int rem= temp%10;
			int prod=1;
			for(int i=1;i<=rem;i++) {
				
				prod=prod*i;
			}
			strong+=prod;
			temp/=10;
			
		}
		if(strong==num) {
			System.out.println("Number is Strong");
		}
		else {
			System.out.println("Number is not a Strong Number");
		}

}
}
