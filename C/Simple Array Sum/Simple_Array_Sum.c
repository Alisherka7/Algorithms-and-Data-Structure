#include <stdio.h>

int simple_sum_array(int n, int array[])
{
    int sum = 0;
    for (int i=0; i<n;i++)
    {
        sum += array[i];
    }
    printf("%d", sum);
}


int main()
{
    int n;
    scanf("%d",&n);
    int array[n];
    for (int i=0; i<n; i++)
    {
        scanf("%d",&array[i]);
    }
    simple_sum_array(n,array);
}
