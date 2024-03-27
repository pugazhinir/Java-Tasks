import java.util.*;
import java.io.*;
public class TextFile{

    public static void main(String[] args) {
        String file1Path = "C:\\Users\\Admin\\Desktop\\Files\\Write.txt"; // Path to the first file
        String file2Path = "C:\\Users\\Admin\\Desktop\\Files\\Read.txt"; // Path to the second file

        try {
            List<String> file1Lines = readFile(file1Path);
            List<String> file2Lines = readFile(file2Path);

            compareAndDisplayDifferences(file1Lines, file2Lines);
        } catch (IOException e) {
            System.err.println("An error occurred while reading the files: " + e.getMessage());
        }
    }

    private static List<String> readFile(String filePath) throws IOException {
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        }
        return lines;
    }

    private static void compareAndDisplayDifferences(List<String> file1Lines, List<String> file2Lines) {
        int maxLength = Math.max(file1Lines.size(), file2Lines.size());

        for (int i = 0; i < maxLength; i++) {
            String file1Line = (i < file1Lines.size()) ? file1Lines.get(i) : "";
            String file2Line = (i < file2Lines.size()) ? file2Lines.get(i) : "";

            if (!file1Line.equals(file2Line)) {
                System.out.println("Difference at line " + (i + 1) + ":");
                System.out.println("File 1: " + file1Line);
                System.out.println("File 2: " + file2Line);
                System.out.println();
            }
        }
    }
}