#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

int main() {
    int n;
    vector<int> v;
    cin >> n;
    while (n-- > 0) {
        int t;
        cin >> t;
        v.push_back(t);
    }
    sort(v.begin(), v.end());
    for (auto a: v) {
        cout << a << " ";
    }
    return 0;
}
