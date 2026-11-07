import java.io.FileNotFoundException;
import java.io.FileReader;

public class Demo6 {
    public static void main(String[] args) {
        // FileNotFoundException
        try{
            readFile();
        }
        catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }

    private static void readFile() throws FileNotFoundException{
        FileReader fr = new FileReader("abc.txt");
    }
}

//checked exception -> compile time exceptions
