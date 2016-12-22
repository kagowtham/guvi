#include<stdio.h>
main(){
  int number,rem,ans=0;
  printf("Enter the number");
  scanf("%d",&number);
  while(number>0){
   rem=number%10;
   number=number/10;
   ans=(ans * 10)+rem;
  }
  printf("%d",ans);
  }
