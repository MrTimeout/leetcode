#include <stdio.h>

int main() {
    int n, s, sum = 0;
    scanf("%d", &n);
    int *a = (int*) malloc(n * sizeof(int));
    for (int i = 0; i < n; i++) {
        scanf("%d", a + i);
        sum += *(a + i);
    }
    printf("%d\n", sum);
    return 0;
}
