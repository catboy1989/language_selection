using System;

namespace Main {
	public class Program {
		public static void Main(string[] args) {
		  
		    int[] numbers = new int[] {1, 2, 3, 4, 5};
		    int sum = sumArray(numbers);
		    Console.WriteLine(sum);
			
			Cat catBoy = new Cat("Tom", 3);
			catBoy.print();
		}
		
		public static int sumArray(int[] arr) {
		    int sum = 0;
            for (int i = 0; i < arr.Length; i++) {
                sum += arr[i];
            }
            return sum;
		}
	}
	
	class Cat {
        private String name;
        private int age;
        
        public Cat(String name, int age) {
            this.name = name;
            this.age = age;
        }

		public void print() {
			Console.WriteLine($"Name: {this.name}, age: {this.age}.");
		}
	}
}