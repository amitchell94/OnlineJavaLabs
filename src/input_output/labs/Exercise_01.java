package input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 1: File input/output
 *
 *      Using the BufferedInputStream, read a file byte by byte and write each byte to a new file.
 *      Make sure you close the connections to both files.
 *
 *
 */

class Controller1 {
    public static void main(String[] args) throws IOException {

            try(FileInputStream input = new FileInputStream("/Users/user/Documents/codingnomads/online_prep/online_java_labs/src/input_output/labs/file.txt");
            FileOutputStream output = new FileOutputStream("/Users/user/Documents/codingnomads/online_prep/online_java_labs/src/input_output/labs/file_copy.txt");
            BufferedInputStream in = new BufferedInputStream(input);
            BufferedOutputStream out = new BufferedOutputStream(output)) {

            int r;

            while ((r = in.read()) != -1) {
                out.write(r);
            }
        }

    }
}

