package Lab5;
import java.util.*;

/**
 * Innermotor
 */
interface motor{
    int capacity=1000;
    void run();
    void consume(); 
}
class washingmachine implements motor{
    int capacity;
    public washingmachine(int capacity){
        this.capacity=capacity;
    }
    public void run(){
        System.out.println("System is running");
    }
    public void consume() {
        System.out.println("System is Consuming");
    }
}
public class motor1{
    public static void main(String[] args) {
        washingmachine wash = new washingmachine(0);
        wash.run();
        wash.consume();
    }
}
