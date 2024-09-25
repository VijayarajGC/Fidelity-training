#include<stdio.h>

int main()
{
    int a[10],i,sum=0;
    printf("Enter the 5 Values: ");
    for(i=0; i<5; i++)
    scanf("%d",&a[i]);
    for(i=0; i<5; i++)
    {
        if(a[i]%2==0)
            sum=sum+a[i];
    }
    printf("Total Sum of Even values is: %d ",sum);   
    return 0;
}