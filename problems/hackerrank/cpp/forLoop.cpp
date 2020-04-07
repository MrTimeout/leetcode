#include <iostream>
#include <vector>

using namespace std;

int main() {

    vector<string> strings = { "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
    int a, b;

    cin >> a >> b;

    for (; a <= b && a < 10; a++) {
        printf("%s\n", strings.at(a-1).c_str());
    }

    for (; a <= b; a++) {
        cout << (a % 2 != 0 ? "odd" : "even") << endl;
    }

    return 0;
}
