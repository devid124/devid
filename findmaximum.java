public class findmaximum {
    public static void main(String[] args) {
        int[]a={1,4,9,12,34};
        int max=Integer.MIN_VALUE;
        for(int element:a){
            if(element>max){
                max=element;
            }
        }
                System.out.println(max);
        }
    }

