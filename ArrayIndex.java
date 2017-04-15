import java.util.Scanner;
class ArrayIndex{
  public static void main(String arg[]){
    int n;
    System.out.println("Enter the number of elements in array");
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
    int a[]=new int[n];
    System.out.println("Enter elements");
    for(int i=0;i<n;i++)
      a[i]=s.nextInt();
    System.out.println("Enter the element to get index");
    int k=s.nextInt();
    int i;
    for(i=0;i<n;i++){
       if(a[i]==k)
         break;
    }
    System.out.println("Index of "+k+" is "+(i));
  }
}