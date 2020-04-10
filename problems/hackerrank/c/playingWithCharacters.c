#include <stdio.h>

int main(void) 
{
    char c;
    char s[100];
    char ss[100];
    scanf("%c\n%[^\n]%*c%[^\n]%*c", &c, &s, &ss);
    printf("%c\n%s\n%s\n", c, s, ss);
    return 0;
}
