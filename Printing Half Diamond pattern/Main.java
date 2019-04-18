#include <stdio.h>
int main() {
  int i,j,n,s;
  scanf("%d",&n);
  for(i=1;i<=n;i++)
  {
    for(s=1;s<=n-i;s++)
    {
      printf(" ");
    }
    s=n;
    for(j=1;j<=2*i-1;j++)
    {
      printf("*");
    }
    printf("\n");
  }
	// Type your code here
	return 0;
}