#include <stdio.h>
int main() {
  int n,i,j,s,num;
  scanf("%d",&n);
  num=1;
  for(i=1;i<=n;i++)
  {
    for(s=1;s<=(n-i);s++)
    {
      printf(" ");
    }
    for(j=1;j<=i;j++)
    {
      printf("%d ",num);
      num++;
    }
    printf("\n");
  }
	// Type your code here
	return 0;
}