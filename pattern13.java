public class pattern13 {
    public static void main(String[] args) {
        int n=5;
        int temp=1;
       for(int i=n;i>=0;i--){
        for(int j=i+1;j<=n;j++){
       System.out.print(temp);
       System.out.print(" ");
       temp++; 
    }
    System.out.println();
}
}
}