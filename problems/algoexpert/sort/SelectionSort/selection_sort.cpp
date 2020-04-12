#include <vector>
#include <limits.h>
using namespace std;

vector<int> selectionSort(vector<int> array) {
    int size = array.size();
    for (int i = 0; i < size; i++) {
        int min = INT_MAX, cont = -1;
        for (int j = i; j < size; j++) {
            if (array.at(j) < min) {
                min = array.at(j);
                cont = j;
            }
        }
        int temp = array.at(cont);
        array.at(cont) = array.at(i);
        array.at(i) = temp;
    }
    return array;
}
