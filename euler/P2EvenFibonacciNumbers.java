package euler;
/*
 * Problem 2: Even Fibonacci Numbers
 * Each new term in the Fibonacci sequence is generated by adding the previous two terms.
 * By starting with 1 and 2, the first 10 terms will be:
 *
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 *
 * By considering the terms in the Fibonacci sequence whose values do not exceed n,
 * find the sum of the even-valued terms.
 *
 * 1. fiboEvenSum(10) should return a number.
 * 2. Your function should return an even value.
 * 3. Your function should sum the even-valued Fibonacci numbers: fiboEvenSum(8) should return 10.
 * 4. fiboEvenSum(10) should return 10.
 * 5. fiboEvenSum(34) should return 44.
 * 6. fiboEvenSum(60) should return 44.
 * 7. fiboEvenSum(1000) should return 798.
 * 8. fiboEvenSum(100000) should return 60696.
 * 9. fiboEvenSum(4000000) should return 4613732.
 */
public class P2EvenFibonacciNumbers {
    public static void main(String[] args) {
        // Test cases
        testFiboEvenSum(8, 10);
        testFiboEvenSum(10, 10);
        testFiboEvenSum(34, 44);
        testFiboEvenSum(60, 44);
        testFiboEvenSum(1000, 798);
        testFiboEvenSum(100000, 60696);
        testFiboEvenSum(4000000, 4613732);
    }
    
    // Helper method to test and validate the function
    private static void testFiboEvenSum(int input, int expected) {
        int result = fiboEvenSum(input);
        boolean passed = result == expected;
        System.out.println("fiboEvenSum(" + input + ") = " + result + 
                          " | Expected: " + expected + 
                          " | " + (passed ? "PASS" : "FAIL"));
    }
    
    public static int fiboEvenSum(int n) {
        int sum = 0;
        
        return sum;
    }
}