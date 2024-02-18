public class CalculateAverage {
public static void main(String[] args) {


  // Check if the correct number of command-line arguments is provided

        if (args.length != 3) {
            System.out.println("java CalculateAverage <number1> <number2> <number3>");
        }


  // Extract command-line arguments and convert them to double

        double number1 = Double.parseDouble(args[0]);
        double number2 = Double.parseDouble(args[1]);
        double number3 = Double.parseDouble(args[2]);


  // Calculate the average
        double average = calculateAverage(number1, number2, number3);


  // Print the result
        System.out.println("Average: " + average);
    }
}
