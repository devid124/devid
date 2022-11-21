public class printforst {
    public static void main(String[] args) {
        String s="geeks for geeks";
        SplitWords(s);
    }

    private static void SplitWords(String s) {
        String []wordS=s.split(" ");
        for(int i=0;i<wordS.length;i++){
            String s1=wordS[i];
            System.out.println(s1.charAt(0));
        }
    }

    
}