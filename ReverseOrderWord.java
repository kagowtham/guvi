package hunter1;

import java.util.Scanner;

public class ReverseOrderWord {
 public static void main(String[] args) {
	 Scanner s=new Scanner(System.in);
	 String a=s.nextLine();
	 String arr[]=a.split(" ");
	 for(int i=0;i<arr.length;i++) {
		 StringBuffer sb=new StringBuffer(arr[i]);
		 sb.reverse();
		 arr[i]=sb.toString();
	 }
	 String b=String.join(" ", arr);
	 System.out.println(b);
 }
}
