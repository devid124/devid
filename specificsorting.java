public class specificsorting {
    public static void main(String[] args) {
        String s="asdDGHasv";
        char[]chararray=s.toCharArray();
        for(int i=0;i<chararray.length;i++){
            for(int j=i+1;j<chararray.length;j++){
                if(chararray[i]>chararray[j]){
                    int temp=chararray[i];
                    chararray[i]=chararray[j];
                    chararray[j]=(char)temp;
                }
            }
        }
        for (char c : chararray) {
            System.out.println(c);
        }
    }
}
