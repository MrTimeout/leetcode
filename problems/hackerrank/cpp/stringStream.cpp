#include <sstream>
#include <vector>
#include <iostream>

std::vector<int> parseInt(std::string str) {
    std::vector<int> v;
    std::stringstream ss(str);
    char c;
    int temp;
    while (ss >> temp) {
        v.push_back(temp);
        ss >> c;
    }
    return v;
}

int main() {

    std::string str;

    std::cin >> str;

    std::vector<int> result = parseInt(str);

    for (auto x: result) {
        std::cout << x << std::endl;
    }

    return 0;
}
