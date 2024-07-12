var numbers: [Int] = [1, 2, 3, 4, 5]
var sum = arraySum(numbers)
print(sum)

var catBoy = Cat("Tom", 3)
catBoy.printCat()

func arraySum(_ arr: [Int]) -> Int {
    var sum = 0
    var index = 0
    while index < arr.count {
        sum += arr[index]
        index += 1
    }
    return sum
}

class Cat {
    
    private var name: String 
    private var age: Int
     
    init(_ name: String,_ age: Int){
         
        self.age = age
        self.name = name
    }
     
    func printCat(){
     
        print("Name: \(self.name). Age: \(self.age)")
    }
}