package TY_JAVA;

public class toLowerAndUpperCase {

	public static void main(String[] args) {
		String s="AAAAbbbCCCCdddEEEE";
		char arr[]=s.toCharArray();
		for(int i=0;i<arr.length;i++) {
			if(Character.isUpperCase(arr[i])) {
				arr[i]= Character.toLowerCase(arr[i]);
			}
			else {
				arr[i]=Character.toUpperCase(arr[i]);
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
	}

}
