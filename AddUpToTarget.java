package hunter1;

import java.util.Scanner;

public class AddUpToTarget {
  public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=s.nextInt();
	}
	int target=s.nextInt();
	printTwoNumber(arr, target);
}
  static void printTwoNumber(int a[],int target){
	  for(int i=0;i<a.length-1;i++) {
		  for(int j=i+1;j<a.length;j++) {
			  int sum=a[i]+a[j];
			  if(sum==target) {
				  System.out.println(a[i]+" "+a[j]);
				  return;
			  }
		  }
	  }
	  System.out.println("no target match");
  }
}
