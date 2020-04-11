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
    int n;
    scanf("%d", &n);
    if (n < 10) printf("%s\n", c[n-1]);
    else printf("Greater than 9");
    return 0;
}
