package main
import "fmt"

func main() {
  numbers := []int{1,2,3,4,5}
  sum := sumArray(numbers)
  fmt.Println(sum)
  
  catBoy := Cat {"Tom", 3}
  catBoy.print()
}

func sumArray(arr []int) int {
    sum := 0
    for _, num := range arr {
        sum += num
    }
    return sum
}

type Cat struct{
    name string
    age int
}

func (cat Cat) print(){
    fmt.Println("Имя:", cat.name)
    fmt.Println("Возраст:",cat.age)
}