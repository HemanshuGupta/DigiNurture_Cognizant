
public class Mythread1 extends Thread{
    @Override
    int i=0;
    while(i<200){
        System.out.println("Thread 1");
        i++;
    }
}

public class Mythread2 extends Thread{
    @Override
    int i=0;
    while(i<200){
        System.out.println("Thread 2");
        i++;
    }
}


public class pt26 {
    public static void main(String[] args) {
        Mythread1 t1 = new Mythread1();
        Mythread2 t2 = new Mythread2();
        try{
            t1.start;
            t2.start;
        }catch(InterruptedException e){
            System.out.println("Code exited due to "+ e);
        }
        
    }
}
