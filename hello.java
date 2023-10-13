import java.util.Scanner;

public class hello {
    public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
       // double to int
    String str="";
    int a = 1000212;
    
    String c=str+a;
    
    for(int i=0;i<c.length();i++){
        System.out.print(c.charAt(i));
    }
    System.out.println(c);
    System.out.println(((Object)c.getClass().getSimpleName()));
    System.out.println(((Object)a).getClass().getSimpleName());
    String s=String.valueOf(a);
    System.out.println(((Object)s).getClass().getSimpleName());
    System.out.println(s.substring(1,2));
      int arr[]= new int[10];
      for(int i=0;i<9;i++){
          arr[i]=sc.nextInt();
      }
      for(int i=0;i<9;i++){
          System.out.print(arr[i]+" ");
      }
      System.out.println(((Object)arr).getClass().getSimpleName());
      sc.close();
    }
  }