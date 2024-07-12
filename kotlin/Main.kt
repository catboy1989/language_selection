class Main {
    fun main() {
        val numbers = arrayOf(1, 2, 3, 4, 5)
        val sum = sumArray(numbers)
        println(sum)

        val catBoy = Cat("Tom", 3);
        catBoy.print()
        
    }
    
    fun sumArray(arr: Array<Int>): Int {
    var sum = 0
    for (number in arr) {
      sum += number
    }
    return sum
}
}

class Cat(private val name: String, private val age: Int) {
    fun print() {
        println("Name: ${this.name}. Age: ${this.age}.")
    }
}