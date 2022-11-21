public class multipleclass {
        void computermethod(){
            System.out.println("its computer");

    }
}
    class laptop{
        void laptopmethod(){
            System.out.println("its lappy");
        }
    public static void main(String[] args) {
        multipleclass c=new multipleclass();
        laptop l= new laptop();
        c.computermethod();
        l.laptopmethod();
    }
    }
