package hunter1;

import java.util.Scanner;

public class ArrayMultiplication {
  public static void main(String[] args) {
	  
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++) {
		a[i]=s.nextInt();
	}
	int b[]=calculateMultiplicationArray(a);
	for(int i=0;i<n;i++) {
		System.out.print(b[i]+" ");
	}
  }
  
  static int[] calculateMultiplicationArray(int a[]) {
	  int b[]=new int[a.length];
	  for(int i=0;i<a.length;i++) {
		  int m=1;
		  for(int j=0;j<a.length;j++) {
			  if(i!=j) {
				  m*=a[j];
			  }
		  }
		  b[i]=m;
	  }
	  return b;
  }
}
