public class DataCalculator {
    protected double length;
    protected double weight;
    protected double high;
    public DataCalculator(double length, double weight, double high) {
        this.length = length;
        this.weight = weight;
        this.high = high;
    }

    public double method1() {
        double num = 0.0;
        num = length + weight;
        return num;
    }
    public double method2() {
        double num = 0.0;
        num = length - weight;
        return num;
    }
    public double method3() {
        double num = 0.0;
        num = length * weight;
        return num;
    }
    public double method4() {
        double num = 0.0;
        num = length / weight;
        return num;
    }
    public double method5() {
        double num = 0.0;
        num = length * weight;
        return num;
    }
    public double method6() {
        double num = 0.0;
        num = length * weight * high;
        return num;
    }
}
