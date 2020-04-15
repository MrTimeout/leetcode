#include <stdio.h>
#include <vector>

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
    
    int a, b, c;
    scanf("%d %d %d", &a, &b, &c);
    v.erase(v.begin()+a-1);
    v.erase(v.begin()+b-1, v.begin()+c-1);

    printf("%ld\n", v.size());
    for (auto x: v) printf("%d ", x);
    return 0;
}
