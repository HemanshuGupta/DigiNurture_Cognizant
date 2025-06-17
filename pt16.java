import java.util.*;


class hrsexception extends Exception{
    public hrsexception(String message){
        super(message);
    }
}
class minexception extends Exception{
    public minexception(String message){
        super(message);
    }
}
class secexception extends Exception{
    public secexception(String message){
        super(message);
    }
}
class Time{
    private int hrs;
    private int min;
    private int sec;

    public void input() throws hrsexception, minexception, secexception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter hours : ");
        hrs = sc.nextInt();
        if(hrs<0 || hrs>24){
            throw new hrsexception("Hours not within 0 to 24!!!");
        }
        System.out.println("Enter minutes : ");
        min = sc.nextInt();
        if(min<0 || min>60){
            throw new minexception("Minutes not within the range of 0 to 60");
        }
        System.out.println("Enter seconds : ");
        sec = sc.nextInt();
        if(sec<0 || sec>60){
            throw new secexception("Seconds not within the range of 0 to 60");
        }
    }
     
    public void output(){
        System.out.println("time : "+hrs+":"+min+":"+sec);
    }
}

public class pt16 {
    public static void main(String[] args) {
        try{
            Time ob1 = new Time();
            ob1.input();
            ob1.output();
        }catch(hrsexception | minexception | secexception e){
            System.out.println("Caught an exception");
            System.out.println("Exception : "+e);
        }
    }
}
