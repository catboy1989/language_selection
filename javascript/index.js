function sumArray(arr) {
    let sum = 0;
    for (let i in arr) {
    sum += arr[i];
    }
    return sum;
}

let numbers = [1, 2, 3, 4, 5];

let sumElement = document.getElementById("sum");
sumElement.innerHTML = sumArray(numbers);


let catboy = {name: "Tom", age: 3};

class Cat {
    constructor(name, age) {
        this.name = name;
        this.age = age;
    }

    print() {
        console.log(`Name: ${this.name}. Age: ${this.age}.`)
    }
}

catboy = new Cat("Tom", 3);
catboy.print();
catboy.weight = 4;
console.log(catboy.weight);