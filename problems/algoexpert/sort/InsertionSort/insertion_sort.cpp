#include <vector>
using namespace std;

vector<int> insertionSort(vector<int> array) {
    int size = array.size();
    for (int i = 0; i < size-1; i++) {
        int j = i+1;
        while (j > 0 && array.at(j) < array.at(j-1)) {
            int temp = array.at(j);
            array.at(j) = array.at(j-1);
            array.at(j-1) = temp;
            j--;
        }
    }
    return array;
}
