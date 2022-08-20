public class h82 {
    int logic(int x,int y){
        int z;
        if(x>y){
        z=x+y;
        }
        else{
        z=(x+y)*5;
        }
        return z;
    }

    public static void main(String[] args) {
        h82 obj=new h82();
        int a=3;
        int b=5;
        int c;
        c=obj.logic(a, b);
        System.out.println(c);
        
    }
}
