public class stringodd {
    public static void main(String[] args) {
        String s="505";
        int n=s.length();
        for(int i=n-1;i>=0;i--){
            if((s.charAt(i)-'0')%2==1){
                String r=s.substring(0, i+1);
                System.out.println(r);
            }
           
        }
    }
}
