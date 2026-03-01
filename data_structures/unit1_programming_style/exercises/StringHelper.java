package unitone.exercises;

/** Word-count calculation for a sentence.
 * @author Fransheska Echevarria
 * @version 1.0
 */

public class StringHelper {

    /** Count how many words are in a sentence
     * @param sentence The sentence in text as a string
     * @return The total number of words
    */

    public int countWords(String sentence) { // Method is public can be access by anyone
        /* Return 0 when sentence is not passed.
        Otherwise, you use the built-in method to automatically
        calulate the length of the sentence.
        */
        if (sentence == null || sentence.trim().isEmpty()) {
            return 0;
        }
        return sentence.trim().split(" ").length; // Split by spaces and count the words
    }
}
