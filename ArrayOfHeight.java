package hunter1;

import java.util.Random;
import java.util.Scanner;

public class ArrayOfHeight {
 public static void main(String[] args) {
	int m[]=new int[50];
	Random random=new Random();
	for(int i=0;i<m.length;i++) {
		m[i]=random.nextInt(60)+120;
	}
	System.out.println("enter k");
	Scanner s=new Scanner(System.in);
	int k=s.nextInt();
	int n[]=new int[50];
	for(int i=0;i<50;i++) {
		n[i]=i;
	}
	for(int i=0;i<50;i++) {
		for(int j=i+1;j<49;j++) {
			if(m[i]<m[j]) {
				int temp=m[i];
				m[i]=m[j];
				m[j]=temp;
				temp=n[i];
				n[i]=n[j];
				n[j]=temp;
			}
		}
	}
	for(int i=5;i<=k+1;i++) {
		System.out.println(i-1 + "th Tallest student is student"+n[i]+" and his height is "+m[i]);
	}
}
}
