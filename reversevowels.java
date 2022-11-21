public class reversevowels {
    public static void main(String[] args) {
        String s="hello";
        char ch;
        String st=" ";
        for(int i=0;i<s.length();i++){
            ch=s.charAt(i);
            st=ch+st;
        }
        System.out.println(st);
    }
}
