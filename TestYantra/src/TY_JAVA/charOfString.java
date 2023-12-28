package TY_JAVA;

import java.util.Scanner;

public class charOfString {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your Char");
		char ch= sc.next().charAt(0);
		String s= "Shreepad";
		System.out.println(s.indexOf(ch));
	}
}
