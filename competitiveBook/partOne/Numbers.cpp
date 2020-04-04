#include <bits/stdc++.h>

using namespace std;

void commonErrorWhenUsingLongLong() {
    int a = 123456789;
    long long b = a * a;
    cout << b << "\n"; //It will result in overflow and the number will be negative because this will pass the limit of 32 bytes
}

//First posiblitiy to solve the problem 
void commonErrorSolvedWhenUsingLongLong_1() {
    int a = 123456789;
    long long b = (long long) a * a;
    cout << b << "\n"; //It will solve the problem.
}

//Second solution to the problem
void commonErrorSolvedWhenUsingLongLong_2() {
    long long a = 123456789LL;
    long long b = a * a;
    cout << b << "\n"; 
}

int main() {

    //The most used type for numbers in competitive programming is int which is 32 bits long
    int a = 1;
    //Another posible type would be "long long", which is 64 bits long
    long long x = 1LL; //Remember to use the LL at the final of the number

    cout << a << x << "\n";

    commonErrorWhenUsingLongLong();
    commonErrorSolvedWhenUsingLongLong_1();
    commonErrorSolvedWhenUsingLongLong_2();

    //Remember that the g++ compiler also provides a 128-bit type __int128_t.

    return 0;
}
