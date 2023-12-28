package TY_JAVA;

import java.util.Scanner;

public class removeDuplicateFromArray {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		
		System.out.println("Enter the elements for the Array");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			int count=0;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
				
			}
			if(count==0) {
				System.out.println("No duplicates");
		}
		
		}
	}

}
