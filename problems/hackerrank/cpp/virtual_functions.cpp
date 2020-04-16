#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

class Person {
public:
    string name;
    int age;
    Person()
    {
    }
    virtual int increment()
    {
        cout << "this increment the value of the cur_id" << endl;
        return -1;
    }
    virtual void getdata()
    {
        cout << "Read data from the input" << endl;
    }
    virtual void putdata()
    {
        cout << "Put data to the out" << endl;
    }
};

class Professor : public Person {
private:
    int publications;
    int cur_id;

public:
    static int id;
    Professor()
    {
        this->cur_id = this->increment();
    }
    void getdata()
    {
        cin >> this->name >> this->age >> this->publications;
    }
    void putdata()
    {
        cout << this->name << " " << this->age << " " << this->publications << " " << this->cur_id << endl;
    }
    int increment()
    {
        id++;
        return id;
    }
};

int Professor::id{ 0 };

class Student : public Person {
private:
    int marks[6];
    int cur_id;
    int sum(int* arr, int b)
    {
        int sum = 0;
        while (b-- > 0) {
            sum += arr[b];
        }
        return sum;
    }

public:
    static int id;
    Student()
    {
        this->cur_id = this->increment();
    }
    void getdata()
    {
        cin >> this->name >> this->age;
        int n = 6, i = 0;
        while (n-- > 0)
            cin >> marks[i++];
    }
    void putdata()
    {
        cout << this->name << " " << this->age << " " << sum(this->marks, 6) << " " << this->cur_id << endl;
    }
    int increment()
    {
        id++;
        return id;
    }
};

int Student::id{ 0 };

int main()
{

    int n, val;
    cin >> n; //The number of objects that is going to be created.
    Person* per[n];

    for (int i = 0; i < n; i++) {

        cin >> val;
        if (val == 1) {
            // If val is 1 current object is of type Professor
            per[i] = new Professor;
        }
        else
            per[i] = new Student; // Else the current object is of type Student

        per[i]->getdata(); // Get the data from the user.
    }

    for (int i = 0; i < n; i++)
        per[i]->putdata(); // Print the required output for each object.

    return 0;
}
