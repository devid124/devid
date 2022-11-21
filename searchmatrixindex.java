public class searchmatrixindex {
    public static void main(String[] args) {
        int n=3;
        int m=3;
        int k=69;
        int[][]a={{ 3, 30, 38},
                  {36, 43, 60},
                  {40, 51, 69}};
                  for (int i = 0; i < n; i++) {
                    for (int j = m - 1; j >= 0; j--) {
                        if (a[i][j]<k){
                            break;
                        }
                        if (a[i][j] == k) {
                           System.out.println(1);
                        }
                        else{
                            System.out.println(0);
                        }
                    }
                }        
    }
}
