#include <stdio.h>

int solveMeFirst(int a, int b) {
    return a + b; 
}

int main(void) {
    int a, b;
    scanf("%d %d", &a, &b);
    int r = solveMeFirst(a, b);
    printf("%d\n", r);
    return 0;
}
