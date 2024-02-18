public class NumberChecker {

    public static void main(String[] args) {
        // Example: Check if 28 is a perfect number
        int numberToCheck = 28;

        if (isPerfectNumber(numberToCheck)) {
            System.out.println(numberToCheck + " is a perfect number.");
        } else {
            System.out.println(numberToCheck + " is not a perfect number.");
        }
    }

    // Function to check if a number is a perfect number
    public static boolean isPerfectNumber(int number) {
        if (number <= 1) {
            return false;
        }

        int sumOfDivisors = 1; // Start with 1 as every number is divisible by 1

        // Check for divisors up to the square root of the number
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                sumOfDivisors += i;
                if (i != number / i) {
                    sumOfDivisors += (number / i);
                }
            }
        }

        // If the sum of divisors equals the number, it is a perfect number
        return sumOfDivisors == number;
    }
}
