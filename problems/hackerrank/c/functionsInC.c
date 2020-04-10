#include <stdio.h>

int max_of_four(int* a, int size) {
    int max = 0;
    while (--size >= 0) if (max < a[size]) max = a[size];
    return max;
}

int main(void) {
    int a[4];
    int size = sizeof(a)/sizeof(int);
    for (int i = 0; i < size; i++) {
        scanf("%d", &a[i]);
    }
    printf("%d\n", max_of_four(a, size));
    return 0;
}
