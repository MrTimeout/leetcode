#include <iostream>
#include <vector>
#include <string>
#include <unordered_map>
#include <limits>

std::unordered_map<std::string, bool> m;

bool is_greater(char* a, char* b) {
    std::string c({'?', ' ', *a, ' ', *b, '\0'});
    std::string d({'?', ' ', *b, ' ', *a, '\0'});
    if (m.find(c) != m.end()) return m.find(c)->second;
    if (m.find(d) != m.end()) return !m.find(d)->second;
    std::cout << c << std::endl;
    std::cout << "hello mellow" << std::endl;
    char e;
    std::cin >> e;
    std::cout << e << std::endl;
    m.emplace(c, e == '>'); // we could use the pair: std::pair<std::string, bool>
    return is_greater(a, b);
}

void helper(std::vector<char>& a, int b, int c) {
    if (b >= c) return;
    int p = b;
    int l = p+1;
    int r = c;
    while (l <= r) {
        bool f = is_greater(&a.at(l), &a.at(p));
        bool e = is_greater(&a.at(p), &a.at(r));
        if (f && e){
            char temp = a.at(l);
            a.at(l) = a.at(r);
            a.at(r) = temp;
        }
        if (!f) l++;
        if (!e) r--;
    }
    char temp = a.at(r);
    a.at(r) = a.at(p);
    a.at(p) = temp;
    if (r-1-b < c-r+1) {
        helper(a, b, r-1);
        helper(a, r+1, c);
    } else {
        helper(a, r+1, c);
        helper(a, b, r-1);
    }
}

void quick_sort(std::vector<char> c) {
    helper(c, 0, c.size()-1);
}

void fill(std::vector<char>& a, int n) {
    for (int i = 0; i < n; i++) a.emplace_back((char) ('A' + i));
}

int main(void) {
    int n, q;
    std::cin >> n >> q;
    std::cin.ignore(std::numeric_limits<std::streamsize>::max(),'\n');
    std::vector<char> v;
    v.reserve(n);
    fill(v, n);
    quick_sort(v);
    for (char c: v) std::cout << c << '\n';
    return 0;
}
