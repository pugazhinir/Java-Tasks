class AverageCalculator{
    public static void main(String[]args) {
        if (args.length == 0) {
        for (int i = 0; i < args.length; i++) {
        numbers[i] = Double.parseDouble(args[i]);
 
            }
        }

        double Average = calculateAverage(numbers);
        System.out.println("The Average of the provided numbers is: " + Average);
    }

  
