package hunter1;

import java.util.Scanner;

public class MatrixZero {
   public static void main(String[] args) {
	
	   Scanner s=new Scanner(System.in);
	   System.out.println("Enter value of n");
	   int n=s.nextInt();
	   int a[][]=new int[n][n];
	   int b[][]=new int[n][n];
	   for(int i=0;i<n;i++) {
		   for(int j=0;j<n;j++) {
			   a[i][j]=s.nextInt();
			   b[i][j]=a[i][j];
		   }
	   }
	   for(int i=0;i<n;i++) {
		   boolean k=false;
		   for(int j=0;j<n;j++) {
			  if(a[i][j]==0) {
				  k=true;
				  break;
			  }
		   }
		   if(k) {
			   for(int l=0;l<n;l++) {
				   b[i][l]=0;
			   }
		   }
		   k=false;
		   for(int j=0;j<n;j++) {
				  if(a[j][i]==0) {
					  k=true;
					  break;
				  }
			   }
			   if(k) {
				   for(int l=0;l<n;l++) {
					   b[l][i]=0;
				   }
			   }
	   }
	   for(int i=0;i<n;i++) {
		   for(int j=0;j<n;j++) {
			   System.out.print(b[i][j]+" ");
		   }
		   System.out.println();
	   }
   }
}
