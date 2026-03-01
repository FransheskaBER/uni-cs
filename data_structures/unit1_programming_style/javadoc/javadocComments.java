package unitone.javadoc;

public class javadocComments {
    /** 
    - Javadoc is a special type of multi-line comments that can
    automatically generate professional documentation websites
    from your code.
    - Javadoc comments that can be processed by a tool that creates nice HTML doc pages (mini-web)
    */

    /** First sentence should be quick summary.
     * you can include special tags @ that have special meanings
     * creates HTML pages
     */

    /** Common Javadoc Tags:
     * @param - describes what a parameter(input) to a method means
     * @return - describes what the method gives back
     * @throws - describes what errors might happen
     * @author - who wrote the code
     * @version - what version of the code this is
    */


    /**
     * Calculates the area of a rectangle.
     * This method multiplies length by width to find the total area.
     * 
     * @param length The length of the rectangle in meters
     * @param width The width of the rectangle in meters
     * @return The area of the rectangle in square meters
     * @author Fransheska Echevarria
     * @version 1.0
     */

    public int calculateArea(int length, int width) {
        return length * width;
    }


    /**
     * A tool called JAVADOC can read these comments and create a webpage that shows:
     * method name calculateArea
     * what it does? "Calculates the area of a rectangle"
     * parameters it needs - length and width
     * what it returns - the area
     */

    /**
     * Breaking it down:
     * @param = "I'm describing a parameter"
     * age = "The parameter's name"
     * The person's age in years = "What it represents"
     */

}
