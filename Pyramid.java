public class Pyramid {
    public static void main(String[] args) {
        int rows = 5;       // Number of rows in the pyramid
        

 for (int i = 1; i <= rows; i++) {
 for (int j = rows - i; j > 0; j--) {
 System.out.print("  "); // Print two spaces
    }
            
            
 for (int j = 1; j <= i; j++) {
 System.out.print(j + " ");                     
            }
            
 for (int j = i - 1; j >= 1; j--) {
 System.out.print(j + " ");                    
   }

System.out.println();                             // Move to the next line for the next row
        }
    }
}

