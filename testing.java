public class testing {
    public static void main(int[] args) {
        System.out.println("hello from int main");
    }
    public static void main(String[] args) {
        int[] a={1,2,3};
        main(a);
        String s="hari";
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        System.out.println(sb);
    }
}
