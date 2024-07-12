function sumArray(arr: number[]): number {
    let sum = 0;
    for (let number of arr) {
        sum += number;
    }
    return sum;
}

const numbers = [1, 2, 3, 4, 5];
console.log(`The sum of the numbers is: ${sumArray(numbers)}`);

class Cat {
    private name: string;
    private age: number;
    constructor(name: string, age: number) {
        this.name = name;
        this.age = age;
    }

    toString(): string {
        return `Name: ${this.name}. Age: ${this.age}.`
    }
}

let catBoy = new Cat("Tom", 3);
console.log(catBoy.toString());