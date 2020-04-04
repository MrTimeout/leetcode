#include <bits/stdc++.h>

using namespace std;

void readFromStandardInput() {
    int a, b;
    string x;

    cin >> a >> b >> x;

    cout << a << b << x << endl;
}

void fasterInputAndOutput() {
    //Sometimes Input and Output is sometimes a bottleneck in the program. The following lines at the beginning
    //of the code make input and output more efficient:
    ios::sync_with_stdio(0);
    cin.tie(0);
}

void newLineVersusEndl() {
    //Remember that the newline works faster than endl;
    cout << "some string" << endl; // endl always causes a flush operation;
    cout << "some string" << "\n";
}

void alternativesToReadAndWrite() {
    //The C functions "scanf" and "printf" are an alternative to the C++ standard streams. They are usually a bit faster,
    //but they are also more difficult to use.
    int c, d;
    scanf("%d %d", &c, &d);
    printf("%d %d\n", c, d);
}

void readingTheWholeLine() {
    //If we want to read a whole line, we could use:
    string s;
    getline(cin, s);
}

void readingWhileThereAreInput() {
    int x;
    //If the amount of data is unknown, the following loop is useful:
    while (cin >> x)
        cout << x << "\n";
}

void readingFromFileAndOutputToFile() {
    //You wil have to write this two lines at the beginning of the program
    freopen("input.txt", "r", stdin);
    freopen("output.txt", "w", stdout);
}

int main() {
    return 0;
}
