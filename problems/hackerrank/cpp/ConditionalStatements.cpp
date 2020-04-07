#include <iostream>
#include <ios>
#include <limits>
#include <vector>

using namespace std;

int main() {

    vector<string> strings = { "one", "two", "three", "four", "five", "sixth", "seven", "eight", "nine", "Greater than 9" };

    int n;

    cin >> n;
    cin.ignore(numeric_limits<streamsize>::max(), '\n');

    if (n >= 1 && n <= 9) cout << strings.at(n-1) << '\n';
    else if (n > 9) cout << strings.at(9) << '\n';

    return 0;
}
