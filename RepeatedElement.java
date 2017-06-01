package kagowtham;

import java.util.Scanner;

public class RepeatedElement {
 public static void main(String[] args) {
	System.out.println("Enter the number of elements");
	Scanner s=new Scanner(System.in);
	Boolean b=false;
	int n=s.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++)
		a[i]=s.nextInt();
	for(int i=0;i<n;i++){
		int j;
		for(j=i+1;j<n;j++){
			if(a[i]==a[j]){
				b=true;
				break;
			}
		}
		if(b){
			System.out.println("The repeated element is "+a[j]);
			break;
		}
	}
}
}
