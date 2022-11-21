public class palimdrome {
    public static void main(String[] args) {
        String s="race car.";
        char ch;
        String s1="";
        for(int i=0;i<s.length();i++){
        ch=s.charAt(i);
        s1=ch+s1;
        }
        System.out.println(s1);
        if(s.equals(s1)){
            System.out.println(1);
        }
        else{
            System.out.println(-1);
        }
    }
    }

