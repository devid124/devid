public class sumofprimenumber {
    public static void main(String[] args) {
        boolean isPrime=true;
        int n=333;
        int sum=0;
        while(n>0){
            int num = n%10;
            if(isPrime(num)==true){
                sum=sum+num;
            }
       n/=10;
        }
        System.out.println(sum);
    }
    private static boolean isPrime(int num) {
        if(num<2){
            return false;
        }
        else{
        for(int i=2;i<num/2;i++){
            if(num%i==0){
            return false;
            }
        }
    }
    return true;
    }
}