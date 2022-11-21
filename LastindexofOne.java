import javax.imageio.plugins.tiff.ExifTIFFTagSet;

public class LastindexofOne {
public static void main(String[] args) {
    String s="000101";
    char temp='1';
    int temp1=-1;
    for(int i=s.length()-1;i>0;i--){
        if(s.charAt(i)==temp){
            temp1=i;
            break;
        }
    }
    System.out.println(temp1);
    }
}