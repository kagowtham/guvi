package guvi;

import java.util.Arrays;
import java.util.Scanner;

public class FindUnique {

	public static void main(String[] args) {
		int n;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		int i;
		Arrays.sort(a);
        for(i=0;i<n-1;i++){
        	if(a[i]==a[i+1]){
        		i++;
        	}
        	else
        	 break;
        		
        }
        System.out.println("The unique element is "+a[i]);
	}

}
