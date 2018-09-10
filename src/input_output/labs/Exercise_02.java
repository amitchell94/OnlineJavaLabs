package input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 1: File encryption
 *
 *      -Using the BufferedReader, read a file character by character and write an encrypted version to a new file.
 *      -For example, change every 'a' to '-' and every 'e' to '~' .
 *      -Make sure you close the connections to both files.
 *
 *      BONUS: If you are feeling bold, read back the encrypted file using the BufferedReader and
 *      print out the unencrypted version. Does it match the original file?
 *
 */

class Controller2 {
    public static void main(String[] args) throws IOException{
        try(FileReader input = new FileReader("/Users/user/Documents/codingnomads/online_prep/online_java_labs/src/input_output/labs/file2.txt");
            FileWriter output = new FileWriter("/Users/user/Documents/codingnomads/online_prep/online_java_labs/src/input_output/labs/file2_encrypted.txt");
            BufferedReader in = new BufferedReader(input);
            BufferedWriter out = new BufferedWriter(output)) {

            int r;

            while ((r = in.read()) != -1) {
                if (r == 'a') {
                    out.write('-');
                } else if (r == 'e') {
                    out.write('~');
                } else {
                    out.write(r);
                }

            }
        }

        try(FileReader input = new FileReader("/Users/user/Documents/codingnomads/online_prep/online_java_labs/src/input_output/labs/file2_encrypted.txt");
            BufferedReader in = new BufferedReader(input)){

            int r;

            while ((r = in.read()) != -1) {
                if (r == '-') {
                    System.out.print('a');
                } else if (r == '~') {
                    System.out.print('e');
                } else {
                    System.out.print((char)r);
                }
            }
        }
    }
}