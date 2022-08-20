public class h77 {
    public static void main(String[] args) {
    int[]array={1,5,8,15,17};
    boolean issorted=true;
    for(int i=0;i<array.length-1;i++){
        if(array[i]>array[i+1]){
            issorted=false;
            break;
    }
}
if(issorted){
    System.out.println("this is sorted");
}
else{
    System.out.println("this is issorted"); 

}
    }
}
