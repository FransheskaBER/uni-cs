package unitone.comments;
public class multiLineComments {
    /* this is my first line
    this is my second line
    this is my third line
    all of these multi-lines are ignored by the computer */
    
    /* common places to use multi-line comments:
    - at the top of a class to explain what a class does
    - before a method to explain what the method does
    - before complex code that needs detailed explanation */

    /*
    This program calculates a student's final grade.
    It takes three test scores, averages them, and
    determines if the student passed (60% or higher).
    Created by: Fransheska Echevarria
    Date: January 2026
     */
    
    int test1 = 85;
    int test2 = 90;
    int test3 = 78;

    /*
    Calculate the avergae of all three tests
    by adding them up and dividing by 3
    */
   int average = (test1 + test2 + test3) / 3;

   boolean passed = average >= 60; // Check if student passed

//    System.out.println("Average: " + average);
//    System.out.println("Passed: " + passed);
}
