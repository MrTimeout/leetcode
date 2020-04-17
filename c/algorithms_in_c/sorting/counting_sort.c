#include <stdio.h>

int max_element(int * a, int b);

void counting_sort(int * a, int b) {
    //The first step is to find the biggest number in the array
    int max = max_element(a, b);

    //The size of the count array is max+1
    int count[max + 1];

    //We fille the array of ints with zero value
    for (int i = 0; i < max + 1; i++) count[i] = 0;

    //Store the count of each element
    for (int i = 0; i < b; i++) count[a[i]]++;

    //Store the cummulative count of each array.
    for (int i = 1; i < max + 1; i++) count[i] += count[i - 1];

    //Find the index of each element of the original array
    //in count array, and place the elements in output array.
    int ouptut[max + 1];
    for (int i = b - 1; i >= 0; i--) {
        output[count[a[i]] - 1] = a[i];
        count[a[i]]--;
    }
}

int max_element(int * a, int b) {
    int max = * a;
    while (--b > 0)
        if (max < * (a + b)) max = * (a + b);
    return max;
}

int main(void) {
    int n;
    scanf("%d", & n);

    int i = 0;
    int arr[n];
    while (n-- > 0) scanf("%d", & arr[i++]);

    counting_sort(arr, sizeof(arr) / sizeof(int));

    return 0;
}
