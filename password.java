public class password {
    public static void main(String[] args) {
        String s="Aa123#$";
        int up=0,sm=0,di=0,sp=0;
        char t;
        for(int i=0;i<s.length();i++){
            t=s.charAt(i);
            if(Character.isUpperCase(t)){
                up=1;
            }
            else if(Character. isLowerCase(t)){
                sm=1;
            }
            else if(Character.isDigit(t)){
                di=1;
            }
            else if(!Character.isDigit(t) && !Character.isLetter(t)){
                sp=1;
            }
        }
        if(s.length()>=8 && s.charAt(s.length()-1)=='$' && up==1 && sm==1 && di==1 && sp==1){
            System.out.println("Your password is strong");
        }
        else{
            System.out.println("Your password is weak");
        }
    }
}
