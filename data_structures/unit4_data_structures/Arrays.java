public class Arrays {
    /*
    Declaration syntax:
        dataType[] variableName;
        Customer[] customers; -> I need an array called "customers" that holds Customer objects   
    
    Instatiation (create the array) syntax:
        variableName = new dataType[capacity];
        customers = new Customer[10]; -> create array that can hold 10 customers

    - You can combine declaration and instantiation, like this:
        Customer[] customers = new Customer[10];
    
    Initialization (set starting values) syntax:
        dataType[] variableName = {value1, value2, value3, ...};
        int[] scores = {85, 92, 78,95}; -> initialization WITH instantiation
    
    Accessing elements (reading/writing):
        arrayName[index]

        Customer[] customers = new Customer[3];
        
        customers[0] = new Customer("Alice");
        customers[1] = new Customer("John");
        customers[2] = new Customer("Charlie");

        System.out.println(customers[1]); -> prints "John"

    The "length" attribute: arrayName.length
        Customer[] customers = new Customer[10];
        System.out.println(customers.length); // prints 10

        Loop through all elements safely:
            for (int i = 0; i < customers.length; i++) {
                System.out.println(customers[i]);
            }
    
    Multidimensional Arrays (arrays of arrays):
        String[][] chessboard = new String[8][8]; -> 8 rows and 8 columns
        chessboard[0][0] = "Rook"; -> access square top-left corner
        chessboard[7][7] = "Rook"; -> access square bottom-right corner

        int[][] triangle = new int[3][]; -> 3 rows and columns unset
        triangle[0] = new int[1]; -> row 0 has 1 element
        triangle[1] = new int[2]; -> row 1 has 2 elements
        triangle[2] = new int[3]; -> row 2 has 3 elements
    

    

        


    
    
    */
}