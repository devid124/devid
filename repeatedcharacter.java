public class repeatedcharacter {
    public static void main(String[] args) {
        String s="geeksforgeeks";
        char []arr=s.toCharArray();
        for(int i=0;i<1;i++){
            for(int j=i+1;j<s.length();j++){
                if(arr[i]==arr[j]){
                    
                }
            }
            System.out.println(arr[i]);

        }
    }
}
