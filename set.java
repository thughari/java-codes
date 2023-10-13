import java.util.*;
public class set {
    public static int[] remduplicat(int n, int a[]){
        int[] res=new int[n];
        for (int i = 0; i < n; i ++){  
            for (int j = i + 1; j < n; j++){
                if ( a[i] == a[j]){
                    res[i]=a[i];
                    for (int k = j; k < n - 1; k++){  
                        a[k] = a [k + 1];
                        
                    }
                }
            }
        }
        System.out.println(a.length);
        return res;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int[] b=new int[a];
        for(int i=0;i<a;i++){
            b[i]=input.nextInt();
        }
        input.close();
        b=remduplicat(a, b);
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }
    }   
}