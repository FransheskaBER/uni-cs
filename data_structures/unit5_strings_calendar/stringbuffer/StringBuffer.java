package stringbuffer;

import java.lang.StringBuilder;

public class StringBuffer {
    /*
    STRING BUFFER CLASS:
        This class is slower, it is better to use StringBuilder
        So when using concateniation with strings, you are creating copies whihc is not memory efficient, so string bugger or builder helps here
        String Builder or Buffer are mutable, they can be changeable directly wihtout crearting object copies
        So the steps are:
            - create a stringbuffer or builder object
            - use append() to add text
            - and then call toString() to convert it back to a regular String object

    METHODS:
        append()
        toString()
    */

        public static void main(String[] args) {
            
            StringBuilder builder = new StringBuilder();
            builder.append("Hello and welcome");
            builder.append(", Mister");
            builder.append(" Lerner!");
            String greeting = builder.toString();
            System.out.println(greeting); // Hello and welcome, Mister Lerner!

            System.out.println(builder.length()); // 33

            builder.delete(0, 10); // remove chars at position 0 until 9
            String welcome = builder.toString();
            System.out.println(welcome); // welcome, Mister Lerner!

            builder.insert(0, "Hi and ");
            String hi = builder.toString();
            System.out.println(hi); // Hi and welcome, Mister Lerner!

            String reverseGretting = builder.reverse().toString();
            System.out.println(reverseGretting); // !renreL retsiM ,emoclew dna iH

            builder.setCharAt(0, '@'); // single quotes - return void
            String changeInitialChar = builder.toString();
            System.out.println(changeInitialChar); // @renreL retsiM ,emoclew dna iH



            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 101; i++) {
                sb.append(i).append(",");
            }
            // String result = sb.toString();
            // System.out.println(result);
            // Output:
            // 0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100,

            StringBuilder sb_ = new StringBuilder("Java is good");
            sb_.insert(7, " very");
            System.out.println(sb_.toString());
           
        }
}
