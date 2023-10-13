import java.text.NumberFormat;
import java.util.Scanner;

public class simpleintrest {
    public static void main(String... args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter principle amount: ");
        int amount=sc.nextInt();
        System.out.print("enter months to be taken: ");
        int months=sc.nextInt();
        System.out.print("enter rate of intrest: ");
        float intrest_rate=sc.nextFloat();
        System.out.printf("%d %d %.2f\n",amount,months,intrest_rate);
        float res=(amount*(months/12)*intrest_rate)/100;
        System.out.println(NumberFormat.getCurrencyInstance().format(res));
        sc.close();
    }
}
