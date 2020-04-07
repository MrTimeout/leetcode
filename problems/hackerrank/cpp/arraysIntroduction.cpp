#include <stdio.h>

int main(void) {
    
    int n;

    scanf("%d", &n);

    int ints[n];

    for (int i = 0; i < n; ++i)
        scanf("%d", &ints[i]);

    for (int i = n-1; i >= 0; --i)
        printf("%d ", ints[i]);

    return 0;

}
