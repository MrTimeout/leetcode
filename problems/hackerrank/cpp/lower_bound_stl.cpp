#include <stdio.h>
#include <vector>
#include <algorithm>

int main() {
    int n;
    scanf("%d", &n);
    std::vector<int> v;
    v.reserve(n);
    while (n-- > 0) {
        int temp;
        scanf("%d", &temp);
        v.emplace_back(temp);
    }
    scanf("%d", &n);
    while (n-- > 0) {
        int temp;
        scanf("%d", &temp);
        std::vector<int>::iterator low = std::lower_bound(v.begin(), v.end(), temp);
        if (*low == temp) {
            printf("Yes %ld\n", (low - v.begin())+1);
        } else {
            printf("No %ld\n", (low - v.begin())+1);
        }
    }
    return 0;
}
