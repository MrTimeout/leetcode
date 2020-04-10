#include <vector>
#include <stdio.h>

using namespace std;

int main() {
    int a, b;
    vector<vector<int>> v;
    scanf("%d %d", &a, &b);
    while (a-- > 0) {
        int t;
        scanf("%d", &t);
        vector<int> d;
        while (t-- > 0) {
            int x;
            scanf("%d", &x);
            d.push_back(x);
        }
        v.push_back(d);
    }
    while (b-- > 0) {
        int t, tt;
        scanf("%d %d", &t, &tt);
        printf("%d\n", v.at(t).at(tt));
    }
    return 0;
}
