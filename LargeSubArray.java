package hunter1;

import java.util.Scanner;

public class LargeSubArray {
   public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int a[]=new int[n];
	int max=-999999;
	int i_value=0;
	int j_value=0;
	
	for(int i=0;i<n;i++) {
		a[i]=s.nextInt();
		if(a[i]>max) {
			max=a[i];
			i_value=i;
			j_value=i;
		}
	}
	for(int i=0;i<n-1;i++) {
		for(int j=i+1;j<n;j++) {
			int sum=0;
			for(int k=i;k<=j;k++) {
				sum+=a[k];
			}
			System.out.println(sum);
			if(sum>max) {
				max=sum;
				i_value=i;
				j_value=j;
			}
		}
		System.out.println();
	}
	System.out.println("The subarray is");
	for(int i=i_value;i<=j_value;i++) {
		System.out.println(a[i]);
	}
    
}
}
