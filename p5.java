public class p5 {
    public static void main(String[] args) {
    int[][]mat1={ { 1, 2,1 },
                   {2, 1, 3},
                   {3, 2, 1} };
    int[][]mat2={ {2, 1, 2},
                  {3, 2, 1},
                  {1, 3, 2}};
    int[][]result={{0, 0, 0},
                   {0, 0, 0},
                   {0, 0, 0} };
    for(int i=0;i<mat1.length;i++){
    for(int j=0;j<mat1[i].length;j++){
    result[i][j]=mat1[i][j]+mat2[i][j];
    System.out.print(result[i][j]+" ");
    }
    System.out.println("\n");
}
    }
}