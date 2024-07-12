public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[] {1, 2, 3, 4, 5};
        int sum = sumArray(numbers);
        System.out.println(sum);

        Cat catBoy = new Cat("Tom", 3);
        catBoy.print();
    }
    
    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
    
}

class Cat {
    private String name;
    private int age;
    
    Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void print() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
    
}