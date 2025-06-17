public class pt14 {
    public static void main(String[] args) {
        int a = 10;
        try{
            int b=a/0;
            System.out.println(b);
        }catch(ArithmeticException e){
            System.out.println("Arithmetic Exception");
        }finally{
            System.out.println("Sorry for inconvenience");
        }
        System.out.println("Hello World");
    }
}
