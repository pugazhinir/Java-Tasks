public class Methodparameters {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 7;
        int sum = add(num1, num2);
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
    }

    public static int add(int a, int b) {
        return a + b;
    }
}
