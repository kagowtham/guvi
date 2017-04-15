import java.util.Scanner;
class LargeIntConcat{
  public static void main(String args[]){
    int n;
    System.out.println("Enter the number of elements in array");
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
    int a[]=new int[n];
    System.out.println("Enter elements");
    for(int i=0;i<n;i++)
      a[i]=s.nextInt();
    for(int i=0;i<n-1;i++){
      for(int j=i+1;j<n;j++){
        if(a[i]<a[j]){
          int t=a[i];
          a[i]=a[j];
          a[j]=t;
        }
      }
    }
    for(int i=0;i<n;i++){

       System.out.print(a[i]);
       if(i!=n-1)
       if(((n-i-1))%3==0)
          System.out.print(",");
    }
  } 
}