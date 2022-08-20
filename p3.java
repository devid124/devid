import javax.lang.model.element.Element;

public class p3 {
    public static void main(String[] args) {
        int[]array={53,32,19,79,25,5,47};
        int min=Integer.MAX_VALUE;
        for(int element:array){
        if(element<min){
            min=element;
        }
    }
            System.out.println(min);
    }
}
