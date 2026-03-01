public class ImportingPackages {
    /*
    1. What is a package? 
        - It's a folder that groups related Java classes together.
        - Java organizes classes into packages.
        - Packages are good for organization, reusability, access-crontrol, two classes
            can have the same name if they are in different packages.
        - Example of a package structure:
        com.onlineshop
            models
                Customer.java
                Product.java
                Order.java
            services
                PaymentService.java
                ShippingService.java
            utils
                Logger.java
                Validator.java
        - Package naming convention is "com.company.project.module" > "com.onlineshop.models"

    2. External Libraries (third-party code)
        - common examples:
            a) Log4j
            b) Apache Commons
            c) Jackson 
            d) JUnit

    3. Classpath (where java looks for code)
        - Java searches for classes when you compile or run your program hence the suffix of the files will be .class
            and that's what Java looks for to run the code.
        - JAR files are Java ARchive, .class files, external libraries
        - example of Classpath:
        /project/bin/           > Your compiled classes
        /project/lib/log4j.jar  > your external library
        /java/lib/rt.jar        > Java standar library (automatic)

        - so when you write Logger logger = .... Java searches these locations to find the Logger class.
    
    4. Fully Qualified Names(FQN) - means that every class in Java has a FQN that includes its package path
        - Example:
        package.name.ClassName
        - When you use FQN, you dont need to use "import", example:
            org.apache.logging.log4j.Logger logger = 
                org.apache.logging.log4j.LogManager.getRootLogger();
        - What this means:
            org.apache.logging.log4j – the package
            Logger – the class name
            Full name: org.apache.logging.log4j.Logger
    
    5. You can use import so to tell java that you will use this class a lot so let me refer to it by its short name
        - Example:
        import package.name.ClassName
        import org.apache.logging.log4j.Logger;
        import org.apache.logging.log4j.LogManager;


    COMPARISON:

    // WITHOUT import (fully qualified names)
    public class Example {
        public static void main(String[] args) {
            java.util.ArrayList<String> list = new java.util.ArrayList<>();
            java.util.Scanner scanner = new java.util.Scanner(System.in);
        }
    }

    // WITH import (short names)
    import java.util.ArrayList;
    import java.util.Scanner;

    public class Example {
        public static void main(String[] args) {
            ArrayList<String> list = new ArrayList<>();  // ✅ Much cleaner!
            Scanner scanner = new Scanner(System.in);
        }
    }

    6. use import.package.name.* to import entire packages
        - so instead of using individual imports like this:
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.LinkedList;
            import java.util.Scanner;
        - use a wildcard import to import all classses from java.util like this:
            import java.util.*;

    - Important packages:
    java.io.* (input/output files or streams)
    java.time.* (Date and time modern API)
    java.math.* (Big number, precise math)
    java.net.* (networking)
        
    */
}