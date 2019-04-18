#include<stdio.h>
int main()
{
  int n,first,third,add;
  scanf("%d",&n);
  first=n/100;
  third=n%10;
  add=first+third;
  printf("%d",add);
  //Type your code here
  return 0;
}