public class Returnmethod {
    public static void main(String[] args) {
        int number = 7;
        boolean isEvenResult = isEven(number);
        System.out.println("Is " + number + " even? " + isEvenResult);
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}
