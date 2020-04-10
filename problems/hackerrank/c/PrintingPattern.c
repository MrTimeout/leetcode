#include <stdio.h>

int main(void) {
    int a, b, c;
    scanf("%d", &a);
    b = a * 2 - 2;
    for (int i = a; i > 0; i--) {
        for (int j = a; j > i; j--) {
            printf("%d ", j);
        }
        for (int j = 0; j < b; j++) {
            printf("%d ", i);
        }
        for (int j = i; j <= a; j++) {
            printf("%d ", j);
        }
        printf("\n");
        b-=2;
    }
    b+=2;
    for (int i = 2; i <= a; i++) {
        b+=2;
        for (int j = a; j > i; j--) {
            printf("%d ", j);
        }
        for (int j = 0; j < b; j++) {
            printf("%d ", i);
        }
        for (int j = i; j <= a; j++) {
            printf("%d ", j);
        }
        printf("\n");
    }
    return 0;
}
