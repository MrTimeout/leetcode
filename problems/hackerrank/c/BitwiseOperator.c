#include <stdio.h>

int main(void) {
    int n, k, s;
    int t[3];
    s = sizeof(t) / sizeof(int);
    scanf("%d %d", &n, &k);
    for (int i = 0; i < s; i++) t[i] = 0;
    for (int i = 1; i < n; i++) {
        for (int j = i+1; j <= n; j++) {
            int temp;
            t[0] = (temp = (i & j)) < k && temp > t[0] ? temp : t[0];
            t[1] = (temp = (i | j)) < k && temp > t[1] ? temp : t[1];
            t[2] = (temp = (i ^ j)) < k && temp > t[2] ? temp : t[2];
        }
    }
    for (int i = 0; i < s; i++) printf("%d\n", t[i]);
    return 0;
}
