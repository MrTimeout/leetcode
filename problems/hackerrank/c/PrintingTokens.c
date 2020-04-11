#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int main() {
    int a;
    char *c;
    c = malloc(1024 * sizeof(char));
    scanf("%[^\n]", c);
    a = strlen(c);
    c = (char*) realloc(c, a * sizeof(char));
    for (int i = 0; i < a; i++) 
        if (*(c + i) != ' ') printf("%c", *(c+i)); 
        else printf("\n");
    return 0;
}
