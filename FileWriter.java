import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;
/**
 * Write a description of class FileWriter here.
 *
 * @author (Tucker & Rajshree)
 * @version (3/16/18)
 */
public class FileWriter
{
    public static void main(String[] args){
        try{
            Scanner in = new Scanner(new File("testfile.txt"));
            Scanner line;
            PrintWriter out = new PrintWriter("outfile.txt");
            String convert, lineIn;

            while(in.hasNextLine()){
                lineIn = in.nextLine();
                line = new Scanner(lineIn);
                while(line.hasNext()){
                    convert = line.next();
                    convert = convert.toUpperCase();
                    out.print(convert+" ");
                }
                out.println();
                line.close();
            }
            in.close();
            out.close();
        }
        catch(IOException e){
            System.err.print("testfile.txt not found!");
        }
    }
}
