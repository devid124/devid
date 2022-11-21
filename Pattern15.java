public class Pattern15 {
    public static void main(String[] args) {
        int n=5;
        for(int i=n;i>0;i--){
            char ch1='A';
            for(int j=i;j>0;j--){
                System.out.print(ch1);   
                ch1++;
            }
            System.out.println();

        }

    }
}