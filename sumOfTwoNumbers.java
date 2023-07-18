// generate class with class name sumOfTwoNumbers | typed 1
public class sumOfTwoNumbers {
    // generate main method
    public static void main(String[] args) {
        // declare two variables
        int a = 74;
        int b = 36;
        // declare a variable to store the sum of two numbers
        int sum = a + b;
        // print the sum of two numbers
        System.out.println("The sum of two numbers is: " + sum);
        // call sumOfAllNumbersBetweenTwoNumbers with 30 and 99 | typed 3
        sumOfAllNumbersBetweenTwoNumbers(30, 99);

    }

    //generate a method to calculate the sum of all numbers between two numbers | typed 2
    public static void sumOfAllNumbersBetweenTwoNumbers(int a, int b) {
        // declare a variable to store the sum of all numbers between two numbers
        int sum = 0;
        // use for loop to calculate the sum of all numbers between two numbers
        for (int i = a; i <= b; i++) {
            sum += i;
        }
        // print the sum of all numbers between two numbers
        System.out.println("The sum of all numbers between two numbers is: " + sum);
    }

    public static void primeNumberTest(int n){
        int loopVariable = 0;
        // for (int i = 2; i < n; i++) { // i intened to use loopVariable but autocomplete worked incorrectly and used i by default
        //     if (n % i == 0){
        //         loopVariable++;
        //     }
        // }

        for (loopVariable = 2; loopVariable < n; loopVariable++) { // typed for(loopVaraible then autocomplete worked correctly)
            if (n % loopVariable == 0){
                System.out.println("Not a prime number");
            }
        }
        if (loopVariable == n){
            System.out.println("Prime number");
        }
    }

}