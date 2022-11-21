public class varags {
    static int sum(int...arr){
    int result=0;
    for (int i : arr) {
        result+=i;
    }
            return result;
    }
    public static void main(String[] args) {
        System.out.println("sum of 4 ,5 " + sum(4,5));
    }
}

    
    