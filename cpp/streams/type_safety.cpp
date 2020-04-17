#include <stdio.h>
#include <iostream>

//It prints all well, no problem...
//The error will be detected no sooner than run time.
void printing_1()
{
    int i = 25;
    char name[50] = "This is my string";
    fprintf(stdout, "%d %s\n", i, name);
}

//In this case, we use the iostream library
//We can see that iostream is type safe, because the operator<< is overloaded
//When we call a int using the "cout <<" it will call operator<<(int);
//And when we call to a string to print to stdout, we use operador<<(const char*)
void printing_2()
{
    int i = 25;
    char name[50] = "This is my string";
    std::cout << i << " " << name << std::endl;
}

int main(void)
{
    printing_1();
    printing_2();
    return 0;
}
