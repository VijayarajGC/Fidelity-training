#include<stdio.h>

int main()
{
	int age;
	printf("Enter the age");
	scanf("%d",&age);
	if(age>=18)
	{
		printf("Eligibility to vote");
	}
	else
	{
		printf("Not eligible tpo vote");
	}
	return 0;
}