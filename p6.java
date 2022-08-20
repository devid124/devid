public class p6 {
static void change(int[]array){
array[2]=35;
}
public static void main(String[] args) {
int[]marks={25,14,56,15,36};  
change(marks);
System.out.println(marks[2]);
}
}
