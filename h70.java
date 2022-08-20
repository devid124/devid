public class h70 {
    public static void main(String[] args) {
        float sum=0;
        float[]marks={78.5f,85.5f,80.5f,98.5f,99.5f};
       // float sum=marks[0]+marks[1]+marks[2]+marks[3]+marks[4];
       for( float element:marks){
       // System.out.println(sum);
       sum=sum+element;
       System.out.println(sum);
    }
}
}
