import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;

public class WorkingWithFiles {
    // DATA STREAM is like a pipe that moves data from one place to another

    // INPUT STREAM -> is the data that flows INTO your program(reading);
    // OUTPUT STREAM -> is the data that flows OUT of your program(writing);

    // DATA SOURCE -> where does the data come from?
    // DATA SINK -> where does the data go?

    // FILES can read a file (a data source) or can write a file (a data sink);


    public static void main(String[] args) {
        // data source
        FileReader reader = new FileReader("input.txt");
        
        // data sink
        FileWriter writer = new FileWriter("output.txt");

        // TWO TYPES OF STREMS:
        // CHARACTER -> text - all files ending in .txt, .csv, .log
        // BYTE -> binary raw - all files ending in .jpg, .pdf, .zip



        // the fileReader reads files character by character so use the bufferReader with the readline methog()


        
    }
}
