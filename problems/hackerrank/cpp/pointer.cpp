#include <stdio.h>
#include <stdlib.h>

void update(int *a, int *b) {
    int temp = *a + *b;
    *b = abs(*b - *a);
    *a = temp;
}


int main(void) {

    int a, b;

    scanf("%d", &a);
    scanf("%d", &b);

    update(&a, &b);

    printf("%d\n%d\n", a, b);

    return 0;
}
