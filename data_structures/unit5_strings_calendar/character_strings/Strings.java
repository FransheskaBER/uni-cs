package character_strings;

public class Strings {
    
    // Strings are objects. They belong to the class String -> from the java.lang.String
    
    // Create Strings:
        // Literal notation:
        String name = "Alice";

        // Using constructors:
        String empty = new String(); // creates empty string ""
        String copy = new String("original"); // creates a copy of "original"

        char[] letters = {'J', 'a', 'v', 'a'};
        String fromChars = new String(letters); // creates "Java" from character array

        // Joining strings with + (concatenation)
        String first = "Hello";
        String second = " world";
        String combine = first + second; // combined = "Hello world"

    // convert numbers to strings
        // 1. concatenation
            int productCount = 12;
            String countText = "" + productCount; // "12"

        // 2. String.valueOf()
            int count = 10;
            String countString = String.valueOf(count); // "10"

    // convert string to numbers/booleans/floats
        String numberText = "12345";
        int number = Integer.parseInt(numberText);
        String badNumberConversion = "age123";
        int badNum = Integer.parseInt(badNumberConversion); // NumberFormatException

        String boolText = "false";
        boolean bool = Boolean.parseBoolean(boolText);

        String floatText = "12.4";
        float fl = Float.parseFloat(floatText); 


    // Searching withing Strings
        // check if string contains/starts with/ends with a certain piece of text
        String fileName = "2013-04-12_A_GmbH_001.csv";
        /* boolean bol_ = 
         if (fileName.endsWith(".csv")) {
            return true;
         } else if (fileName.startsWith("2013")) {
            return false;
         } else if (fileName.contains("001")) {
            return true; */ 

    // finding positions. Where in the string a character or substring appears?
        // indexOf(substring)
        // lastIndexOf(substring)
        String fileName_ = "2013-04-12_A_GmbH_001.csv";

        // visual representation
        // Position:
        // 0123456789012345678901234
        // 2013-04-12_A_GmbH_001.csv

        int firstUnderscoe = fileName_.indexOf("_"); // 10
        int lastUnderscore = fileName.lastIndexOf("_"); //17

        String text_ = "Java is fun, Java is powerful";
        int first_ = text_.indexOf("Java"); // return 0
        int second_ = text_.lastIndexOf("Java"); // return 13
        int doesntExist = text_.indexOf("Python"); // return -1

        // extrac parts
        // String substring(int start, int end);
        public static void main(String[] args) {
            // String fil = "2013-04-12_A_Volvo_001.csv";
            
            // int manufacturerStart = fil.indexOf("_"); // inclusive
            // System.err.println(manufacturerStart);

            // int manufacturerEnd = fil.lastIndexOf("_"); // exclusive
            // System.out.println(manufacturerEnd);

            // String manufacturer_ = fil.substring(manufacturerStart, manufacturerEnd); // _A_Volvo
            // System.out.println(manufacturer_);

            // String manufacturer = fil.substring(manufacturerStart + 3, manufacturerEnd); // Volvo
            // System.out.println(manufacturer);

            // System.out.println(fil.endsWith(".csv"));
            // System.out.println(fil.contains("001"));

            // String email = "john.doe@company.com";
            // // Extract "company.com"

            // // Your code here:
            // int atPosition = email.indexOf("@");
            // String domain = email.substring(atPosition + 1, email.lastIndexOf("m")+ 1);
            // System.out.println(domain);

            // String f = "document.backup.pdf";
            // int dotPosi = f.lastIndexOf(".");
            // String extension = f.substring(dotPosi + 1);
            // System.out.println(extension);

            // String word = "Programming";
            // System.out.println(word.substring(0, 7));
            // System.out.println(word.substring(7));


            /* 
            MODIFYIN STRINGS with replace()
                String replace(char oldChar, char newChar); -> replace characters
                String replace(String oldText, String newText); -> replace substrings
            */ 
        //    String manufacturerName = "A_GmBh";
        //    String realName = manufacturerName.replace("_", " ");
        //    System.out.println(realName); //  A GmBh but the original never changes its still A_GmBh

        //    String fullName = "Fransheska Echevarria Rojas";
        //    String correctedName = fullName.replace("Rojas", "Ramirez");
        //    System.out.println(fullName); // Fransheska Echevarria Rojas
        //    System.out.println(correctedName); // ransheska Echevarria Ramirez


            /*
            GET INDIVIDUAL CHARACTERS WITH CHARAT()
                char charAt(int index)
            */
        //    String word = "Java";
        //    char firstChar = word.charAt(0); // J
        //    char secondChar = word.charAt(1); // a
        //    System.out.println(firstChar);
        //    System.out.println(secondChar);


           /*
           COMPARING STRINGS -> NEVER use "==" instead USE equals() and equalsIgnoreCase() -=> because Strings are objects remember
           */
        //   String yourName = "Alice";
        //   String herName = "ALICE";
        //   boolean yourNameEqualsHerName = yourName.equals(herName); // False because it is case-sensitive
        //   System.out.println(yourNameEqualsHerName);
        //   boolean yourNameEqualHerName_ = yourName.equalsIgnoreCase(herName); // true
        //   System.out.println(yourNameEqualHerName_);


        /*
        COMPARE ALPHABETICALLY WITH COMPARETO()
        */
    //    String name1 = "Adelbert";
    //    String name2 = "Adele";
    //    int result = name1.compareTo(name2);
    //    System.out.println(result); // -3 because name1 comes BEFORE name2

    //    String fruit1 = "Kiwi";
    //    String fruit2 = "Apple";
    //    System.out.println(fruit1.compareTo(fruit2)); // positive 10 - because fruit 1 comes AFTER fruit 2

    //    String dog1 = "Pepper";
    //    String dog2 = "Pepper";
    //    System.out.println(dog1.compareTo(dog2)); // 0 (same position)



            String product = "  laptop_computer  ";
            product = product.trim();
            product = product.replace("_", "-");
            System.out.println(product);  // Should print "laptop-computer"

            String password = "MySecure123";
            boolean isValid = password.length() >= 8 && password.toLowerCase().contains("secure");
            System.out.println(isValid); 


            String a = "Hello";
            String b = "hello";
            System.out.println(a.equals(b));              // false
            System.out.println(a.equalsIgnoreCase(b));    // true
            System.out.println(a.compareTo(b));           // Negative









        }


}