package lab6;

public class employee3 {
    protected int empid;;
    public double earnings(double basic){
        double DA = (0.8*basic);
        double HRA = (0.15*basic);
        return (basic+DA+HRA);
    }
}
