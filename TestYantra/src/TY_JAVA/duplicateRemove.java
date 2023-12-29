package TY_JAVA;

import java.util.Scanner;

public class duplicateRemove {
	public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your Sentence to remove duplicates");
        String s=sc.nextLine();
        String arr[]=s.split(" ");
        String newString="";
        
        for(int i=0;i<arr.length;i++){
            boolean flag=true;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i].equals(arr[j])){
                    flag=false;
                    break;
                }
                
            }
            if(flag){
                    newString+=arr[i]+" ";
                }
        }
        System.out.println(newString);
}
}
