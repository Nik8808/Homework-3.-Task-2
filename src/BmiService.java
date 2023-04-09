public class BmiService {
    public double calculate(double height, double weight) {
        double y = height * height;
        double x = weight / y;
        double z = (int) x;
        return z;
    }
}
