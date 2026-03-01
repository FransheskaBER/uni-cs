package splitting_character_strings;
import java.lang.String;


public class SplitStrings {
    /*
    CSV -> each line is a row and the comma separate the columns

    SPLIT()
        chop a string into pieces based on a separator
        String[] split(String separator)    
        */

    public static void main(String[] args) {

        // String sentence = "apple,banana,cherry";
        // String[] fruits = sentence.split(",");
        // System.out.println(Arrays.toString(fruits));
        // System.out.println((fruits[0]));
        // System.out.println((fruits[1]));

        // price have commans so the regular split() method wont work, we need a sMART SEPARATOR
        // String line = "'bah90131','Title 1','Manufacturer 1','12,56'";
        // String[] parts = line.split("','");
        // Result:
        // parts[0] = "'bah90131"           ← Still has leading quote
        // parts[1] = "Title 1"             ← Perfect!
        // parts[2] = "Manufacturer 1"      ← Perfect!
        // parts[3] = "12,56'"              ← Still has trailing quote



        // better but not perfect, we need instead substring()
        // String center = line.substring(1, line.length() - 1); // remove first and last character the outer quotes
        // String[] parts2 = center.split("','");
        // Result:
        // parts[0] = "bah90131"         ← Clean!
        // parts[1] = "Title 1"          ← Clean!
        // parts[2] = "Manufacturer 1"   ← Clean!
        // parts[3] = "12,56"            ← Clean!

        // String mystring = "'hola.";
        // String clean = mystring.substring(1, mystring.length() - 1);
        // System.out.println(clean); // hola -> extract indices 1 until 4

        // // it is better to use CSV parsing library for production code
        // String data = "Java-Python-JavaScript";
        // String[] languages = data.split("-");

        // System.out.println(languages.length);  // 3
        // System.out.println(languages[0]);      // Java
        // System.out.println(languages[2]);      // JavaScript

        /*
        ADVANCE SPLITTING TECHNIQUES
            - Regex
            - split() can create empty strings in an array if your separator is comma and you have ,, togehter
            -if you string ends with , and your separator is a comma - the trailing empty string is removed by default
            - to keep the trailing comma as empty string use split(",", -1);
            - TRIM()
        */
        // String userData = " John , 25 , Developer ";
        // String[] parts = userData.split(",");
        // for (int i = 0; i < parts.length; i++) {
        //      parts[i] = parts[i].trim();
        // }
        // System.out.println(parts[0]);
        // System.out.println(parts[1]);
        // System.out.println(parts[2]);

        String csvLine = "'Product A','Description: Works great, very useful','19.99'";
        String center = csvLine.substring(1, csvLine.length() - 1);
        String[] parts = center.split("','");
        System.out.println(center);  
        System.out.println(parts.length);  
        System.out.println(parts[2]);      
    }

   

}