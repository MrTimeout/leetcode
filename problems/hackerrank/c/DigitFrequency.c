#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(void) {
    int *r = (int*) malloc(10 * sizeof(int));
    char *c = (char*) malloc(1024 * sizeof(char));

    scanf("%[^\n]", c);

    int a = strlen(c);
    c = (char*) realloc(c, a * sizeof(char));

    for (int i = 0; i < 10; i++) *(r+i) = 0;

    for (int i = 0; i < a; i++) {
        int t = *(c+i);
        if (t >= 48 && t <= 57) (*(r+(t-48)))++;
    }

    for (int i = 0; i < 10; i++) printf("%d ", *(r+i));

    return 0;
}
