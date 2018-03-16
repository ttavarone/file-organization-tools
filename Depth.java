import java.nio.file.*;
abstract public class Depth implements Path
{
    public static void main(String[] args){
        Path f = Paths.get(".");
        f = f.toAbsolutePath();
        
        int depthCount = 0;
        while(f.getParent()!=null){
            if(f.getParent()!=null){
                depthCount++;
                f = f.getParent();
            }
        }
        depthCount--;
        System.out.print("Depth is: \n"+depthCount);
    }
}
