package character_strings;

public class FilenameParser {
    
    public static void main(String[] args) {
        // Test cases
        String file1 = "2024-01-15_Samsung_Electronics_001.csv";
        String file2 = "2024-03-20_Apple_Inc_002.CSV";
        String file3 = "2023-12-01_Sony_Corporation_001.csv";
        
        System.out.println("=== Testing File 1 ===");
        processFile(file1);
        
        System.out.println("\n=== Testing File 2 ===");
        processFile(file2);
        
        System.out.println("\n=== Testing File 3 ===");
        processFile(file3);
    }
    
    public static void processFile(String filename) {

        // Step 1: Check if valid (starts with 2024, ends with .csv, contains 001)
        if (filename.toLowerCase().endsWith(".csv") && filename.startsWith("2024") && filename.contains("001")) {
            String date = filename.substring(0, filename.indexOf("_"));
            String manufacturerName = filename.substring(filename.indexOf("_") + 1, filename.lastIndexOf("_"));
            String versionNumber = filename.substring(filename.lastIndexOf("_") + 1, filename.indexOf("."));
            String cleanManufacturerName = manufacturerName.replace("_", " ");
            System.out.println(String.format("Date: %s, Manufacturer Name: %s, VersionNumber: %s",
            date, cleanManufacturerName, versionNumber));
        } else {
            System.out.println("File rejected");
        }                
    }
}
// === Testing File 1 ===
// File accepted for import!
// Date: 2024-01-15
// Manufacturer: Samsung Electronics
// Version: 001

// === Testing File 2 ===
// File rejected: Version must be 001

// === Testing File 3 ===
// File rejected: Year must be 2024
