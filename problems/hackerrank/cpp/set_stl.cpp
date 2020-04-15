#include <stdio.h>
#include <set>

int main() {
    int n;
    scanf("%d", &n);
    std::set<int> s;
    while (n-- > 0) {
        int a, b;
        scanf("%d %d", &a, &b);
        if (a == 1) {
            s.insert(b);
        } else if (a == 2) {
            s.erase(b);
        } else if (a == 3) {
            printf("%s\n", s.find(b) != s.end() ? "Yes" : "No");
        }
    }
    return 0;
}
