import java.nio.file.*;
import java.io.*;
import java.util.ArrayList;
abstract public class Lister implements Path
{   
    public Path getFileName(){
        return this;
    }

    public static void main(String[] args)
    {
        ArrayList<String> files = new ArrayList<String>();
        Path dir = Paths.get(".");

        try(DirectoryStream<Path> stream = Files.newDirectoryStream(dir)){
            System.out.println("Before lexicographical sort");
            for(Path file: stream){
                String fileName = file.getFileName().toString();
                System.out.println(fileName);
                files.add(fileName);
            }

            for(int i = 0; i < files.size()-1; i++){
                for(int j = i+1; j < files.size(); j++){
                    if(files.get(i).compareTo(files.get(j))>0){
                        String temp = files.get(j);
                        files.set(j, files.get(i));
                        files.set(i, temp);
                    }
                }
            }
            System.out.println("\nAfter lexicographical sort");
            for(int j = 0; j < files.size()-1; j++){
                System.out.println(files.get(j));
            }
        }
        catch(IOException | DirectoryIteratorException x){
            System.err.println(x);
        }
    }
}
