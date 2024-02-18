public class CopyConstructor{

    private int intValue;
    private String stringValue;

    // Default constructor
    public CopyConstructor() {
        // Default values or any other initialization logic
        intValue = 0;
        stringValue = "Default";
    }

    // Copy constructor
    public CopyConstructor(CopyConstructor other) {
        // Initialize instance variables based on the values of the passed object
        this.intValue = other.intValue;
        this.stringValue = other.stringValue;
    }

    // Getter and setter methods (if needed)
    public int getIntValue() {
        return intValue;
    }

    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }

    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    // Main method to demonstrate the use of the copy constructor
    public static void main(String[] args) {
        // Create an instance of CopyConstructor
        CopyConstructor originalObject = new CopyConstructor();
        originalObject.setIntValue(40);
        originalObject.setStringValue("hey welcome to java world");

        // Use the copy constructor to create a new object with the same values
        CopyConstructor copiedObject = new CopyConstructor(originalObject);

        // Display values of the original and copied objects
        System.out.println("Original Object: int=" + originalObject.getIntValue() +
                ", string=" + originalObject.getStringValue());
        System.out.println("Copied Object: int=" + copiedObject.getIntValue() +
                ", string=" + copiedObject.getStringValue());
    }
}












        