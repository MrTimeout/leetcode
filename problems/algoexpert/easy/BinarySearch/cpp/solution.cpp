#include <iostream>
#include <vector>

using namespace std;

int binarySearch(vector<int> arr, int target, int left, int right) {
    if (left > right) return -1;
    int mid = left + (right - left) / 2;
    if (arr.at(mid) == target) return mid;
    else if (arr.at(mid) > target) return binarySearch(arr, target, left, mid - 1);
    else return binarySearch(arr, target, mid + 1, right); // arr.at(mid) < target;
}

int solve(vector<int> arr, int target) {
    return binarySearch(arr, target, 0, arr.size() - 1);
}

int main() {

    int n;

    scanf("%d", &n);

    while (n-- > 0) {

        int target;
        int capacity;
        vector<int> v;

        scanf("%d", &target);
        scanf("%d", &capacity);

        while (capacity-- > 0) {
            int p;
            scanf("%d", &p);
            v.push_back(p);
        }

        printf("The position of the number %d is %d", target, solve(v, target));

    }

    return 0;
}
