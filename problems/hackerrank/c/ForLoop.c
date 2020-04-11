#include <stdio.h>

int main(void) {
    char c[9][10] = {
        "one",
        "two",
        "three",
        "four",
        "five",
        "six",
        "seven",
        "eight",
        "nine"
    };
    int a, b;
    scanf("%d %d", &a, &b);
    for (; a <= b; a++)
        if (a < 10) printf("%s\n", c[a-1]);
        else if (a % 2 == 0) printf("even\n");
        else printf("odd\n");
    return 0;
}
