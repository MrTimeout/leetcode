#include <vector>
using namespace std;

vector<int> bubbleSort(vector<int> array) {
    int size = array.size();
    for (int i = 0; i < size-1; i++) {
        for (int j = i+1; j < size; j++) {
            if (array.at(i) > array.at(j)) {
                int temp = array.at(i);
                array.at(i) = array.at(j);
                array.at(j) = temp;
            }
        }
    }
    return array;
}
