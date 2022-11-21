import java.util.ArrayList;
import java.util.Arrays;

public class common {
    public static void main(String[] args) {
        ArrayList<Integer>a1=new ArrayList<Integer>(Arrays.asList(1,2,2,5,1));
        ArrayList<Integer>a2=new ArrayList<Integer>(Arrays.asList(1,2,5,4,2));
        a2.retainAll(a1);
        System.out.println(a2);
    }
}
