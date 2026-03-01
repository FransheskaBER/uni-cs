public class JavaClassLibrary {
    /*
    pre-java 8 > developers used to use java.util.Date but after java8+ > java.time package is better

    - Java class library is a java toolbox that has pre-written classes.
        They are already included, always available, well-tested and free 

    - Major Packages in the Java Class Library:

    1. java.lang
        language fundamentals:
            String - text manipulation
            Math - mathematical operations
            System - system operations like println/exit
            Integer/Double/Boolean - wrapper classes
            Object - parent of all classes
            Thread - multithreading
        Example:
        String name = "Alice";
        int max = Math.max(10, 20);
        System.out.prinln("Hello " + name);
    
    2. java.util
        utilities and collections > contains data structures, utilities, date/time
            Important classes:
            - ArrayList, HashMap, HashSet -> collections
            - Scanner -> read user input
            - Collections -> utility methods for collections
            - Random -> random numbers
            - Date, Calendar -> old date/time (avoid this, use java.time instead)
    
    3. java.io
        input/output > contains reading and writing files or streams
            Important classes:
            - File -> file/directory operations
            - FileReader, FileWriter -> text file input and output
            - BufferedReader, BufferedWriter -> efficient I/O
            - InputStream, OutputStream - byte streams
        example:
        import java.io.File;
        import java.io.FileWriter;

        File f1 = new File("data.txt");
        FileWriter w1 = new FileWriter(f1);
        w1.write("hello, file 1!");
        w1.close();
    
    4. java.time:
        LocalDate
        LocalTime
        LocalDateTime
        Duration
        Period
        DateTimeFormatter

        example:
        import java.time.LocalDate;
        import.java.time.format.DateTimeFormatter;

        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate = today.format(formatter);
    
    5. java.net
        URL - url handling
        URLConnection - HTTP connections
        Socket - TCP sockets
        ServerSocket - server sockets

        example:
        import java.net.URL

        URL url = new URL("https://www.example.com");
    
    6. java.math
        For big numbers and precision
    


    SCANNER:
    import java.util.Scanner;

    Scanner(InputStream source) -> creates a scanner that read from a specified input stream
    int nextInt() -> scans the next token of the input as an int
    Strinh nextLine() -> returns the skipped input

    public class MenuExample {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("=== MENU ===");
            System.out.println("1. Test Case 1");
            System.out.println("2. Test Case 2");
            System.out.println("3. Test Case 3");
            System.out.print("Enter your choice: ");

            int userChoice = scanner.nextInt();

            if (userChoice == 1) {
                System.out.println("Running Test Case 1...");
            } else if (choice == 2) {
                System.out.println("Running Test Case 2...");
            } else if (choice == 3) {
                System.out.println("Running Test Case 3...");
            } else {
                System.out.println("Invalid choice!");
            }
            
            scanner.close();
        }    
    }

    */
}
