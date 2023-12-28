package TY_JAVA;

public class countOfWords {
public static void main(String[] args) {
	String s="My name is Shreepad and I live in Bengaluru";
	String arr[]=s.split(" ");
	int count=0;
	for(int i=0;i<arr.length;i++) {
		count++;
	}
	System.out.println(count);
	}

}
