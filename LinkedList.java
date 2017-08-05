import java.util.Scanner;

class Node{
	int value;
	Node next;
	Node(){
		this.next=null;
	}
	Node(int value){
		this.value=value;
		this.next=null;
	}
}
public class LinkedList {
     public static void main(String[] args) {
    	 Node head=null;
		 System.out.println("Enter no of elements in the list");
		 Scanner s=new Scanner(System.in);
		 int n=s.nextInt();
		 for(int i=0;i<n;i++) {
			head=addValue(s.nextInt(), head);
		 }
		 display(head);
		 head=reverse(head);
		 display(head);
	 }
     
     static Node addValue(int value,Node head) {
    	  Node node=new Node(value);
    	  if(head==null) {
    		  return node;
    	  }else {
    		  Node t=head;
    		  while(t.next!=null) {
    			 t=t.next;
    		  }
    		  t.next=node;
    	  }
    	  return head;
     }
     
     static void display(Node head) {
    	 while(head!=null) {
    		 System.out.print(head.value+" ");
    		 head=head.next;
    	 }
    	 System.out.println();
     }
     
     static Node reverse(Node head) {
    	 Node te=head;
    	 Node head2=null;
    	 Node t=null;
    	 while(t!=head) {
    	   while(te.next!=t) {
    		  te=te.next;
    	   }
    	   t=te;
    	   te=head;
    	   Node n=new Node(t.value);
    	   if(head2==null) {
    		   head2=n;
    	   }else {
    		   Node temphead2=head2;
    		   while(temphead2.next!=null) {
    			   temphead2=temphead2.next;
    		   }
    		   temphead2.next=n;
    	   }
    	 }
    	 return head2;
     }
}
