public class stringsort {
    public static void main(String[] args) {
        String s="AkBsd";
        char[]chararray=s.toCharArray();
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(chararray[i]>chararray[j]){
                    int temp=chararray[i];
                    chararray[i]=chararray[j];
                    chararray[j]=(char)temp;
                }
            }
        }
        System.out.println(chararray);
    }
}
