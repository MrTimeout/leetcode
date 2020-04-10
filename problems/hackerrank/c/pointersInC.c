#include <stdio.h>
#include <math.h>

void update(int* a, int* b)
{
    int t = *a + *b;
    *b = abs(*a - *b);
    *a = t;
}

int main(void)
{
    int a, b;
    int *pa = &a;
    int *pb = &b;
    scanf("%d %d", &a, &b);
    update(pa, pb);
    printf("%d\n%d\n", a, b);
}
