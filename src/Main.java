import java.util.Scanner;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                4,
                8,
                10,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(5),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy()
        );
        System.out.println("请输入您想要使用的方法");
        System.out.println("仅输入方法前的数字即可");
        System.out.println("1-加法,2-减法,3-乘法,4-除法,5-长方形(平方),6-长方体(立方)");
        Scanner scanner = new Scanner(System.in);
        int method = scanner.nextInt();
        DataInput dataInput = new DataInput();
        Future<?> future = pool.submit(dataInput);

        try {
            future.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println("输入数据: 长=" + dataInput.length + ", 宽=" + dataInput.weight + ", 高=" + dataInput.high);
        DataCalculator calculator = new DataCalculator(dataInput.length, dataInput.weight, dataInput.high);
        double result = 0.0;

        switch (method) {
            case 1:
                result = calculator.method1();
                break;
            case 2:
                result = calculator.method2();
                break;
            case 3:
                result = calculator.method3();
                break;
            case 4:
            result = calculator.method4();
            break;
            case 5:
                result = calculator.method5();
                break;
            case 6:
                result = calculator.method6();
                break;
            default:
                System.out.println("无效的方法编号");
                pool.shutdown();
                return;
        }
        DataOutput dataOutput = new DataOutput(calculator.length, calculator.weight, calculator.high, result, method);
        dataOutput.displayResult();

        pool.shutdown();
    }
}
