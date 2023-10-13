import java.util.Scanner;

//hari siva out: Friends#2
//hari sine out: Stranger#1


public class wipro {
    public static void main(String... args){
        String a,b;
        Scanner sc= new Scanner(System.in);
        a=sc.nextLine();
        b=sc.nextLine();
        sc.close();
        for(int i=0;i<a.length();i++){
            for(int j=0;j<b.length();j++){
                if(a.charAt(i)==b.charAt(j)){
                    String temp="";
                    temp+=a.charAt(i);
                    a=a.replaceFirst(temp, "");
                    b=b.replaceFirst(temp, "");
                    break;
                }
            }
        } 
        System.out.println(a+" "+a.length()+"\n"+b+" "+b.length());
            
        
    }
}
