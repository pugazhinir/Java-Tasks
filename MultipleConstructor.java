public class MultipleConstructor{

    private int intValue;
    private String stringValue;

    // Constructor with no parameters
    public MultipleConstructor() {
        // Default values or any other initialization logic
        intValue = 0;
        stringValue = "Default";
    }

    // Constructor with one parameter
    public MultipleConstructor(int intValue) {
        // Initialize instance variables based on the provided parameter
        this.intValue = intValue;
        this.stringValue = "Parameterized Value";
    }

    // Constructor with two parameters
    public MultipleConstructor(int intValue, String stringValue) {
        // Initialize instance variables based on the provided parameters
        this.intValue = intValue;
        this.stringValue = stringValue;
    }

    // Getter methods (if needed)
    public int getIntValue() {
        return intValue;
    }

    public String getStringValue() {
        return stringValue;
    }

    // Main method to demonstrate object instantiation and display results
    public static void main(String[] args) {
        // Instantiate objects using different constructors
        MultipleConstructor defaultObject = new MultipleConstructor();
        MultipleConstructor paramObject = new MultipleConstructor(42);
        MultipleConstructor paramObject2 = new MultipleConstructor(99, "Custom Value");

        // Display results
        System.out.println("Default Object: int=" + defaultObject.getIntValue() +
                ", string=" + defaultObject.getStringValue());

        System.out.println("Parameterized Object: int=" + paramObject.getIntValue() +
                ", string=" + paramObject.getStringValue());

        System.out.println("Another Parameterized Object: int=" + paramObject2.getIntValue() +
                ", string=" + paramObject2.getStringValue());
    }
}
