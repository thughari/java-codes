public class pow {
    public static void main(String[] args) {
        int input1=375;
        String s=""+input1;
        int m=s.charAt(0)-48;
        int n=s.charAt(s.length()-1)-48;
        System.out.println(Math.pow(m,n));
    }
}
