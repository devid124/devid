public class divisble {
    public static void main(String[] args) {
        String s="14";
        int rem=0;
       
        for(int i=0;i<s.length();i++){
            rem=((rem*10)+(s.charAt(i)-'0'))%7;
            
        }
        if(rem==0){
            System.out.println("divisble");
        }
        else{
            System.out.println("no");
        }
    }
}
