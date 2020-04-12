#include <iostream>
#include <stdio.h>

using namespace std;

int main(void) {

    int a, b, c;
    char str[1024];

    scanf("%d", &a);
    scanf("%d %d\n", &b, &c);
    scanf("%[^\n]%*c", &str);

    printf("%d %s\n", (a + b + c), str);

    return 0;
}
