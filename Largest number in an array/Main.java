#include<stdio.h>
int main()
{
  int size,key;
  scanf("%d",&size);
  int arr[size];
  for(int i=0;i<size;i++)
  {
    scanf("%d",&arr[i]);
  }
  key =arr[0];
  for(int i=1;i<size;i++)
  {
    if(key<arr[i])
      key=arr[i];
  }
  printf("%d",key);
   
  
  
  //fill the code
  return 0;
}