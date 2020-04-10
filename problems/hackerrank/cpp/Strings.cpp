#include <iostream>
#include <string>
using namespace std;

int main() {
    string s, ss;
    getline(cin, s);
    getline(cin, ss);
    cout << s.size() << " " << ss.size() << endl;
    cout << s + ss << endl;
    cout << ss.at(0) + s.substr(1) << " " << s.at(0) + ss.substr(1) << endl;
    return 0;
}
