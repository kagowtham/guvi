#include<stdio.h>
#include<string.h>
main(){
  char string[100],temp;
  int i;
  printf("Enter the string\n");
  scanf("%s",string);
  for(i=0;i<strlen(string)/2;i++){
    temp=string[i];
    string[i]=string[strlen(string)-i-1];
    string[strlen(string)-i-1]=temp;
  }
  printf("\n%s",string);
}
