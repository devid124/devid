public class Pattern16 {
    public static void main(String[] args) {
        int n=10;
        int temp=1;
        char ch='A';
        for(int i=0;i<n;i++){
            String s=String.valueOf(ch);
            System.out.println(s.repeat(temp));    
            ch++;
            temp++;
        }
    }
}
