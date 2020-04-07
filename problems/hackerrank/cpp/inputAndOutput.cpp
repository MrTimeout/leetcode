#include <iostream>

using namespace std;

int main() {

    int sum = 0,
        a;

    for (int i = 0; i < 3; ++i) {
        cin >> a;
        sum += a;
    }

    cout << sum << endl;

    return 0;
}
