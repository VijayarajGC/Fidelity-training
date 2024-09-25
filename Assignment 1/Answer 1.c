#include <stdio.h>

int main()
{
	int size, i, sum = 0;
	float average = 0;

	printf("Please Enter the Array size = ");
	scanf("%d", &size);

	int arr[size];

	printf("Enter the Array Elements : ");
	for (i = 0; i < size; i++)
	{
		scanf("%d", &arr[i]);
	}

	for (i = 0; i < size; i++)
	{
		sum = sum + arr[i];
	}

	average = (float)sum / size;

	printf("\nThe Sum of Array Elements     = %d\n", sum);
	printf("\nThe Average of Array Elements = %.2f\n", average);
}