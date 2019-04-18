#include<stdio.h>

  int power(int b,int e);
int main()
{
  int b,e;
  scanf("%d%d",&b,&e);
  printf("%d",power(b,e));
    // Type your code here
  	return 0;
}
int power(int b,int e)
{
  int p=1;
  while(e>=1)
  {
    p=p*b;
    e--;
  }
  return p;
}
