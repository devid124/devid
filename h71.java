public class h71 {
    public static void main(String[] args) {
        int[]marks={56,98,65,87,45};
        int num=56;
        boolean isInArray=false;
        for(int element:marks){
            if(num==element){
                isInArray=true;
                break;
            }
        }
            if(isInArray){
                System.out.println("value is present");
            }
        else{
            System.out.println("valuie is not present");

    }
}
}
