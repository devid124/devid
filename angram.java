import java.util.Arrays;

public class angram {
    public static void main(String[] args) {
        String s1="geeksfor";
        String s2="geeksfor";
        char[]chararray=s1.toCharArray();
        char[]chararray1=s2.toCharArray();
        Arrays.sort(chararray);
        Arrays.sort(chararray1);
        if(chararray1==chararray){
            System.out.println("yes");
        }
        else{
            System.out.println("No");
        }
    }
}
