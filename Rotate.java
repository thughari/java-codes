import java.util.Arrays;

public class Rotate {
    public static void main(String[] args) {
        int[] a={2,0,2,0,0};
        for(int j = a.length-1; j > 0; j--){    
            a[j] = a[j-1];    
        }
        a[0]=0;
        System.out.print(Arrays.toString(a));
    }
}
