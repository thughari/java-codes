
public class acii {
    public static void main(String... hari){
        String input1="Human Physiology";
        input1=input1.replaceAll("[aeiouAEIOU]", "");
        String res="";
        int cnt=0;
        for(int i=0;i<input1.length();i++){
            if((char)input1.charAt(cnt)>=97){
                res+=(char)(input1.charAt(cnt)-32);
            }
            else if((char)input1.charAt(cnt)>=65 && (char)input1.charAt(cnt)<97){
                res+=(char)(input1.charAt(cnt)+32);
            }
            if(input1.charAt(cnt)==' '){
                res+=" ";  
            }
            cnt++;
        }
        System.out.println(res);   
    }
}
