public class DataOutput extends DataCalculator{

    private double result;
    private int method;

    public DataOutput(double length, double weight, double high, double result, int method) {
        super(length, weight, high);
        this.result = result;
        this.method = method;
    }

    public void displayResult() {
        String methodName;
        switch (method) {
            case 1:
                methodName = "加法";
                break;
            case 2:
                methodName = "减法";
                break;
            case 3:
                methodName = "乘法";
                break;
            case 4:
                methodName = "除法";
                break;
            case 5:
                methodName = "长方形(平方)";
                break;
            case 6:
                methodName = "长方体(立方)";
                break;
            default:
                methodName = "未知方法";
        }
        System.out.println("计算方法: " + methodName);
        System.out.println("计算结果: " + result);
    }
}