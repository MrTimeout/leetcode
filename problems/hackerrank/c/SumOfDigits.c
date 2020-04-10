#include <stdio.h>

int main() {
    int n, x = 0;
    scanf("%d", &n);
    while (n > 0) {
        x += n % 10;
        n /= 10;
    }
    printf("%d\n", x);
    return 0;
}
