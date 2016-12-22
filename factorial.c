#include<stdio.h>
main(){
  int number,ans=1;
  printf("Enter the number\n");
  scanf("%d",&number);
  while(number>0){
   ans=ans*number;
   number--;
  }
  printf("\n%d",ans);
}
