import java.util.Scanner;
class FindUnique{
   public static void main(String arg[]){
      int n,k=0;
      Scanner s=new Scanner(System.in);
      n=s.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
        a[i]=s.nextInt();
      for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
          if(a[i]==a[j]){
             k++;
          }
        }
       if(k==0){
          System.out.println("ans: "+a[i]);
          break;
       }
        k=0;
      }
   }
}