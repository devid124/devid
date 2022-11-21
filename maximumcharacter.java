public class maximumcharacter {
    public static void main(String[] args) {
        String s="aaeviid";
        char []arr=s.toCharArray();
        boolean flag=false;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=(char) temp;
                }
            }
        }
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(arr[i]==arr[j]){
                    System.out.print(arr[i]);
                    
                }
            }
            
        }
    }
}
