#include <iostream>

using namespace std;

int main() {

    int i;
    long l;
    char ch;
    float f;
    double d;

    scanf("%d", &i);
    scanf("%ld", &l);
    scanf(" %c", &ch);
    scanf("%f", &f);
    scanf("%lf", &d);

    printf("%d\n%ld\n%c\n%.3f\n%.9lf\n", i, l, ch, f, d);

    return 0;
}
