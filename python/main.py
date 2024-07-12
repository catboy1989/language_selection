from typing import List

def sumArray(arr: List[int]) -> int :
    sum = 0
    for number in arr:
        sum += number
    return sum

numbers = [1, 2, 3, 4, 5]
print(sumArray(numbers))

class Cat:
    def __init__(self, name:str, age: int) -> None:
        self.__name = name
        self.__age = age
    def print(self):
        print("Name: %s. Age: %d" % (self.__name, self.__age))


catBoy = Cat("Tom", 3)
catBoy.print()
catBoy.face = "beautiful"
print(catBoy.face)
