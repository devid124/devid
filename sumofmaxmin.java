public class sumofmaxmin {
    public static void main(String[] args) {
    int[]a={1,4,2,5};
    int min=Integer.MAX_VALUE;
    int max=Integer.MIN_VALUE;
    for(int element:a){
    if(element<min){
    min=element;
    }
    if(element>max){
        max=element;
    }
}
    int sum=min+max;
    System.out.println(sum);

    }
}
