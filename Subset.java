package guvi;

import java.util.Scanner;

public class Subset {

	public static void main(String[] args) {
		System.out.println("Enter the size of a1");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println("Enter the size of a2");
		int m=s.nextInt();
		int a1[]=new int[n];
		int a2[]=new int[m];
		for(int i=0;i<n;i++)
			a1[i]=s.nextInt();
        for(int i=0;i<m;i++)
        	a2[i]=s.nextInt();
        for(int i=0;i<n;i++){
        	Boolean a=false;
        	for(int j=0;j<m;j++){
        		if(a1[i]==a2[j]){
        			a=true;
        			break;
        		}
        	}
        	if(!a){
        		System.out.println("a1 is not subset");
        		return;
        	}
        }
        System.out.println("a1 is a subset");
	}

}
