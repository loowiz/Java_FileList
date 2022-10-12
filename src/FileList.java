import java.io.File;

public class FileList {
    String pathName;
    String[] listFileNames;

    /**
     * The constructor for FileList.
     *
     * @param pathName is the path name of the folder to be shown.
     */
    public FileList(String pathName) {
        this.pathName = pathName;
        File fileDir = new File(pathName);
        listFileNames = fileDir.list();
    }

    /**
     * toString method to print the list of files.
     *
     * @return a string to be printed.
     */
    @Override
    public String toString() {
        StringBuilder print = new StringBuilder();

        for (String dir : listFileNames) {
            print.append(dir);
            print.append("\n");
        }
        return print.toString();
    }

}
