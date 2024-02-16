public class CheckPrimeNumber {

    public static void main(String[] args) {
        // Check if the correct number of command-line arguments is provided
        if (args.length != 1) {
            System.out.println("Usage: java CheckPrimeNumber <number>");
            System.exit(1);
        }

        // Extract the command-line argument and convert it to an integer
        int number = Integer.parseInt(args[0]);

        // Check if the number is prime
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // 0 and 1 are not prime numbers
        }

        // Check for divisibility from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // If divisible, it's not a prime number
            }
        }

        return true; // If not divisible by any number, it's a prime number
    }
}
