import java.io.*;

public class buffer {
    public static void main(String args[]) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a=Integer.parseInt(reader.readLine()); //buffer input converts string to integer
        System.out.println(a);        
    }
}
