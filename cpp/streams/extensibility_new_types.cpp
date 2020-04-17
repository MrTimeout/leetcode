#include <iostream>

struct Pair
{
    int x;
    std::string y;
    Pair(int x, std::string y) 
        : x(x), y(y)
    {

    }
};

std::basic_ostream<char>& operator<<(std::basic_ostream<char>& o, const Pair& p)
{
    return o << p.x << " " << p.y << std::endl;
}

int main(void)
{
    Pair p(5, "May");
    std::cout << p;
    return 0;
}
