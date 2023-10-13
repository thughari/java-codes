import java.util.Arrays;
import java.util.Scanner;

public class splitinjava {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String split[]=a.split("");
        System.out.println(Arrays.toString(split));
        sc.close();
    }
}
