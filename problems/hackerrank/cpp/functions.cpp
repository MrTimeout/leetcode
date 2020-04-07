#include <iostream>

using namespace std;

int max_of_arr(int arr[], int size) {
    int max = 0;
    for (int i = 0; i < size; ++i) 
        max = max > arr[i] ? max : arr[i];
    return max;
}

int main(void) {

    int ints[4];
    int size = (int) sizeof(ints) / sizeof(int);

    for (int i = 0; i < size; ++i) {
        cin >> ints[i];
    }

    cout << max_of_arr(ints, size) << endl;

    return 0;
}
