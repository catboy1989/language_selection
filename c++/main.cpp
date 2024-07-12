#include <iostream>
#include <string>

std::string stringConcat(std::string str1, std::string str2) {
    std::string result = str1 + str2;
    return result;
}

class Cat {
    private:
        std::string name;
        unsigned age;
    public:
        void print() {
        std::cout << "Name: " << name << " Age: " << age << std::endl;
        }
        Cat(std::string name, unsigned age) {
        this->name = name;
        this->age = age;
        }
};

int main() {
    std::string str1 = "Hello ";
    std::string str2 = "world";
    std::string result = stringConcat(str1, str2);
    std::cout << result << "\n";
    
    Cat catBoy("Tom", 3);
    catBoy.print();

    return 0;
}