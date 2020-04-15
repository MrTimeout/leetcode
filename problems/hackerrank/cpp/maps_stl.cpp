#include <stdio.h>
#include <map>
#include <iostream>

int main() {
    int n;
    scanf("%d", &n);
    std::map<std::string, int> m;
    while (n--) {
        int temp, b;
        std::string a;
        std::cin >> temp >> a;
        if (temp == 1) {
            std::cin >> b;
            if (m.find(a) != m.end()) {
                std::map<std::string, int>::iterator it = m.find(a);
                it->second = it->second + b;
            } else m.insert(std::pair<std::string, int>(a, b));
        } else if (temp == 2) m.erase(a);
        else if (temp == 3) printf("%d\n", m.find(a) != m.end() ? m.at(a) : 0);
    }
    return 0;
}
