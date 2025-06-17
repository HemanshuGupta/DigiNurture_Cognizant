class CheckArgument extends Exception{
    public CheckArgument(String message){
        super(message);
    }
}

public class pt18 {
    public static void main(String[] args) {
        try{
            if(args.length<4){
                throw new CheckArgument("Exception occurred!!!");
            }else{
                int SumOfSquare = 0;
                for(String arg : args){
                    int num = Integer.parseInt(arg);
                    SumOfSquare += num*num;
                }
                System.out.println("Sum of squares : "+SumOfSquare);
            }
        }catch (CheckArgument e){
            System.out.println(e.getMessage());
        }
    }
}
