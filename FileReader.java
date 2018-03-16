import java.util.Scanner;
import java.io.*;
/**
 * Write a description of class FileReader here.
 *
 * @author (Tucker & Rajshree)
 * @version (3/15/18)
 */
public class FileReader
{
    public static void main(String[] args){
        try{
            Scanner in = new Scanner(new File("testfile.txt"));
            int lineCount = 0;
            int wordCount = 0;
            int charCount = 0;
            
            while(in.hasNextLine()){
                lineCount++;
                in.nextLine();
            }
            in = new Scanner(new File("testfile.txt"));
            while(in.hasNext()){
                wordCount++;
                String s = in.next();
                charCount += s.length();
            }
            
            in.close();
            System.out.print("There are\n"+lineCount+" lines,\n"+
            wordCount+" words,\n"+charCount+" characters in this document.");
        }
        catch(IOException e){
            System.err.print("testfile.txt not found!");
        }
    }
}
