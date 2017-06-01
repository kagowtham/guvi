package kagowtham;

import java.util.Arrays;
import java.util.Scanner;

public class OddTwiceRepeated {
 public static void main(String[] args) {
	System.out.println("Enter the number of elements");
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++)
		a[i]=s.nextInt();
	Arrays.sort(a);
	for(int i=0;i<n-1;i+=2){
		System.out.println(a[i]+"=="+a[i+1]);
		if(a[i]!=a[i+1]){
			System.out.println("integer appear only once is "+a[i]);
			break;
		}
	}
}
}
