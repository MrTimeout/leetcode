#include <iostream>

using namespace std;

void creatingArrayAndPointer() {
    //[] means "array of"
    char p[5]; //This creates an array of chars with a length of 5
    //* means "pointer to"
    char* pointer; // pointer to character
}

void copyArray() {
    int array_1[5] = {1,2,3,4,5};
    int array_2[5];
    
    cout << "Copying array_1 to array_2" << endl;

    for (auto i = 0; i < (int) (sizeof(array_1)/sizeof(int)); ++i)
        array_2[i] = array_1[i];

    cout << "Looping an array using the auto word and for each loop" << endl;

    for (auto x: array_2)
        cout << x << endl;

    cout << "Looping an array that is defined in for loop time" << endl;

    for (auto x: {1,2,3,4})
        cout << x << endl;

    cout << "Looping the array_2 using the auto&, which means by reference" << endl;

    for (auto& x: array_2)
        cout << ++x << endl; // Remember that we are changing now the actual value of it in the array.

    cout << "Looping again the array_2, but this time using a normal for each loop" << endl;

    for (auto x: array_2)
        cout << x << endl;

}

int count_x(char* p, char x) {
    if (p == nullptr)
        return 0;
    int count = 0;
    for (; *p != 0; ++p) if (*p == x) count++;
    return count;
}

void usingPointer() {
    int a = 2;
    int* memoryAddressOfA = &a; //& means "address of"
    int x = *memoryAddressOfA; //* means "contents of"

    cout << "a = " << a << endl;
    cout << "memoryAddressOfA = " << memoryAddressOfA << endl;
    cout << "x = " << x << endl;

}

int main(void) {

    usingPointer();
    copyArray();

    char chars[3] = {'a', 'a', 'b'};

    cout << "Count of a in chars array: " << count_x(chars, 'a') << endl;

    return 0;
}
