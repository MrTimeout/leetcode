#include <stdio.h>
#include <stdlib.h>

int main(void) {
    int n;
    int *a;
    scanf("%d", &n);
    a = (int*) malloc(n * sizeof(int));
    for (int i = 0; i < n; i++) scanf("%d", a + i);
    for (int i = 0; i < n/2; i++) {
        int temp = *(a+i);
        *(a+i) = *(a+n-i-1);
        *(a+n-i-1) = temp;
    }
    for (int i = 0; i < n; i++) printf("%d ", *(a+i));
    return 0;
}
