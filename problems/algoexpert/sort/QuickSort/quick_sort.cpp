#include <vector>
using namespace std;

void helper(vector<int>& a, int b, int c);

vector<int> quickSort(vector<int> array) {
  helper(array, 0, array.size()-1);
	return array;
}

void helper(vector<int>& a, int b, int c) {
	if (b >= c) return;
	int l = b+1;
	int r = c;
	int p = b;
	while (l <= r) {
		if (a.at(l) > a.at(p) && a.at(r) < a.at(p)) {
			int temp = a.at(l);
			a.at(l) = a.at(r);
			a.at(r) = temp;
		}
		if (a.at(l) <= a.at(p)) l++;
		if (a.at(r) >= a.at(p)) r--;
	}
	//Swapping the pivote
	int temp = a.at(r);
	a.at(r) = a.at(p);
	a.at(p) = temp;
	//Is left of the array smaller than the right part
	if (r-1-b < c-r+1) {
		helper(a, b, r-1);
		helper(a, r+1, c);
	} else {
		helper(a, r+1, c);
		helper(a, b, r-1);
	}
}
