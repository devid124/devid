import javax.lang.model.element.Element;

public class h75 {
    public static void main(String[] args) {
        int[]array={2,54,87,4,69};
        int max=Integer.MIN_VALUE;
        for(int element:array){
            if(element>max){
                max=element;
            }
        }
        System.out.println("value of maximum element is "+ max);
    }
}
