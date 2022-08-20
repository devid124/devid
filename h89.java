public class h89 {
static int factorial(int n){
if(n==0||n==1){
return 1;
}
else{
//return n*factorial(n-1);
int product=1;
for(int i=1;i<=5;i++){
product*=i;
}
return product;
}
}
public static void main(String[] args) {
    int n=5;
System.out.println("the value of factorial " + factorial (n));
}
}

