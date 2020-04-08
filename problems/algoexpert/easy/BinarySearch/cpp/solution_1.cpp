#include <stdio.h>
#include <vector>

using namespace std;

int binary_search(vector<int>& v, int target) {
    int left = 0,
        right = v.size() - 1,
        mid;
    while (left <= right) {
        mid = left + (right - left) / 2;
        if (v.at(mid) == target) return mid;
        else if (v.at(mid) > target) right = mid - 1;
        else left = mid + 1; //v.at(mid) < target
    }
    return -1;
}

int main(void) {

    int n;

    scanf("%d", &n);

    while (n-- > 0) {

        int target, capacity;
        vector<int> v;

        scanf("%d %d", &target, &capacity);

        while (capacity-- > 0) {
            int temp;
            scanf("%d", &temp);
            v.push_back(temp);
        }

        printf("For the target %d the binary_search method returned: %d\n", target, binary_search(v, target));

    }

    return 0;
}
