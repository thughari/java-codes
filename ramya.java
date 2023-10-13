
public class ramya {
    public static void main(String[] args) {
        
        String s="johndaviharry12345@wipro.nom";
        boolean flag=false;
        String[] p1=s.split("@");
        char t;
        if(s.contains(".com") && s.contains("@") && p1[0].length()<=15){
            s=s.replaceFirst("@", ":");
            s=s.replaceFirst(".com", "");
            flag=true;
        }
        for(int i=0;i<s.length();i++){
            t=s.charAt(i);
            if((Character.isUpperCase(t) || !Character.isLetterOrDigit(t)) && t!=':'){
                flag=false;
                break;
            }
        }
        s=s.replace(":", ":@");
        if(flag){
            s=s.replace("@", "");
            String[] s1=s.split(":");
            System.out.println(s1[0]+":.com:valid");
        }
        else{
            String[] s2=s.split(".");
            System.out.println(s);
            s2[0]=s.replace("@", ":@");
            s=s.replace(".com", "");
            System.out.println(s2[0]+s2[1]+":invalid");
        }
		
	}
}
