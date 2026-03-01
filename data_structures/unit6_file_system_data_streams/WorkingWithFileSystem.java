import java.io.File; // old way
// import java.nio.file.Path;
// import java.nio.file.Files;

public class WorkingWithFileSystem {

    // the class File represents a path to a file or directory
    //  it is like a pointer that just have the location

    // PATH is a string -> "/var/import"
    // FILE OBJECT connects this string/path to the actual file system

    // PATH -> is an address whereas FILE object is like GPS

    public static void main(String[] args) {
        // create a file object (just creates the java object thst represents path but doesnt create the actual file)
        File myFile = new File("/var/import/data.csv");
        System.out.println("Does it exist? " + myFile.exists()); // false

        // to find if a folder exists use:
        File[] roots = File.listRoots(); // get all root directories
        for (File root : roots) {
            System.out.println(root); // / meanignthat the single root is "/"
        }

        File root = new File("/");
        File[] contents = root.listFiles();
        for (File item : contents) {
            System.out.println(item);
        }
        // Output:
        // /home
        // /usr
        // /.resolve
        // /bin
        // /sbin
        // /.file
        // /etc
        // /var
        // /Library
        // /System
        // /.VolumeIcon.icns
        // /private
        // /.vol
        // /Users
        // /Applications
        // /opt
        // /dev
        // /Volumes
        // /.nofollow
        // /tmp
        // /cores


        // PATH can start from the root folder or from the folder you are right now

        // File.separator gives you the /

        // // to rename files: - change the DESTINATION/LOCATION
        // String separatorinmycomputer = File.separator;

        // "/DATA/userdata.csv"
        // File myfile = new File(separatorinmycomputer + "data" + separatorinmycomputer + "userdata.csv");
        // File destination = new File(separatorinmycomputer + "src" + separatorinmycomputer + "userdata.csv");
        // boolean success = myFile.renameTo(corretName);

    }
}