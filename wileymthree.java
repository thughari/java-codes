import java.util.ArrayList;
import java.util.Scanner;
public class wileymthree {
    public static void main(String... args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        String[] str=(""+c).split("");
        int arr[]=new int[b-a];
        sc.close();
        int ind=0;
        for(int i=a;i<=b;i++){
            int count=0;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    count++;
                    break;
                }
            }
            if(count==0){
                arr[ind]=i;
                ind++;
            }
        }
    ArrayList<Integer> res = new ArrayList<Integer>();
   
    int i=0;
    while(arr[i]!=0){
        String s="";
        if(str.length>1){
        String r=s+arr[i];
        if(r.contains(str[0])||r.contains(str[1])||r.contains((s+c))){
            res.add(arr[i]);
            System.out.print(arr[i]+" ");
        }
        i=i+1;
    }
    else{
        String s1="";
        String r=s1+arr[i];
        if(r.contains(s1+c)){
            res.add(arr[i]);
            System.out.print(arr[i]+" ");
        }
        i=i+1;
        }
    
    } 
    System.out.println("here  size: "+res.size()+" array: "+res);
    /*res.remove(Integer.valueOf(23));*/
    System.out.println(res);
}
}