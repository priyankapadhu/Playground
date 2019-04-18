#include<stdio.h>
int main()
{
  int year,rem;
  scanf("%d",&year);
  rem=year%4;
  if(rem==0)
    printf("Leap year");
  else
    printf("Not Leap year");
  //Type your code here
  return 0;
}