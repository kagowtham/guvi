package hunter1;

import java.util.Scanner;

class Node{
	char data;
	Node node;
}
public class LinkedListPalindrome {
    public static void main(String[] args) {
		Node start=null;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		String a=s.next();
		for(int i=0;i<a.length();i++) {
			start=append(start,a.charAt(i));
		}
		display(start);
		findPalindrome(start);
	}
    static Node append(Node start,char data) {
    	Node newNode=new Node();
    	Node t = null;
    	newNode.data=data;
    	newNode.node=null;
    	if(start ==null) {
    		start=newNode;
    	}else {
    		t=start;
    		while(t.node!=null) {
    		 t=t.node;
    		}
    		t.node=newNode;
    	}
		return start;
    }
    static void display(Node start) {
    	while(start!=null) {
    		System.out.print(start.data);
    		start=start.node;
       	}
    }
    static void findPalindrome(Node start) {
    	Node t=null,f=null;
    	Node a=start;
    	int n=0;
    	while(a!=null) {
    		n++;
    	    a=a.node;
       	}
    	for(int i=0;i<n/2;i++) {
    		char q;
    		char w;
    		f=start;
    		q=start.data;
    		start=start.node;
    		while(f.node!=t) {
    			f=f.node;
    		}
    		w=f.data;
    		t=f;
    		if(q!=w) {
    			System.out.println(" is not palindrome");
    			return;
    		}
    	}
    	System.out.println(" is palindrome");
    }
}
