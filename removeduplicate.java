public class removeduplicate {
    public static void main(String[] args) {
        String s="gfg";
        int j=0;
        char[]chararray=s.toCharArray();
        for(int i=0;i<chararray.length-1;i++){
                if(chararray[i]!=chararray[i+1]){
                   chararray[j]=chararray[i];
                    j++;
                }
            }
           chararray[j]=chararray[chararray.length-1];
       for(int i=0;i<j+1;i++){
        System.out.println(chararray[i]);
       }
        
    }
}
