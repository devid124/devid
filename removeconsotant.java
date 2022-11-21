
public class removeconsotant {
    public static void main(String[] args) {
        String s="aweui";
        char ch;
        String s1="";
        boolean flag=false;
        for(int i=0;i<s.length();i++){
            ch=s.charAt(i);
            if(s.charAt(i)=='a'||s.charAt(i)==('e') ||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                s1=s1+ch;
               flag=true;
        }
    }
    if(!flag){
        System.out.println("no");
    }
        else{
            System.out.println(s1);
        }
    }
}