package geometry;
import java.util.*;
import geometry.circle;
public class demo {
    public static void main(String[] args) {
        circle c1 = new circle();
        c1.set_radius();
        c1.get_radius();
        void perimeter(){
            int p=(2*3.14*radius);
            System.out.println("perimeter : "+p);
        }
        void area(){
            int a = (3.14*radius*radius);
            System.out.println("area : "+a);
        }
    }
}
