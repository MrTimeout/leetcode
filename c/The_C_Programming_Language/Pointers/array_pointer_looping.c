#include <stdio.h>

int main(void) {
    int n, i = 0;

    scanf("%d", &n);

    int arr[n];
    int * p;

    while (n-- > 0) scanf("%d", &arr[i++]);

    printf("Printing the array using a pointer that points to the first element in the array\n");
    p = &arr[0];
    n = i;
    for (int i = 0; i < n; i++) {
        printf("%d\t", *(p + i));
    }

    printf("\nFinishing the program\n");

    return 0;
}
