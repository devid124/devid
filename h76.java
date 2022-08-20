public class h76 {
    public static void main(String[] args) {
        int[]array={54,65,5,4,2,98};
        int min=Integer.MAX_VALUE;
        for(int element:array){
        if(element<min){
        min=element;
        }
    }
    System.out.println("value of minimum is"+  min );
    }
}
