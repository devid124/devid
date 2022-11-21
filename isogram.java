import javax.lang.model.util.ElementScanner14;

public class isogram {
    public static void main(String[] args) {
        String s=" ada";
        char arr[]=s.toCharArray();
        boolean flag=false;
        for(int i=0;i<s.length();i++){
            for(int j=0;j<s.length();j++){
                if(arr[i]>arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] =  (char) temp;
                 }
              }
           }
        for (int i = 0; i <s.length()-1; i++) {
            if (arr[i] == arr[i + 1]){
               flag=true;
        }
    }
    if(!flag){
        System.out.println("isogram");

    }
    else{
        System.out.println("no");
    }
    }
}
