import java.util.Scanner;

public class DataInput implements Runnable {
    public double length;
    public double weight;
    public double high;
    Scanner sc = new Scanner(System.in);

    @Override
    public void run() {
        try{
            System.out.println("请以小数形式输入");
            System.out.print("请输入加/减/乘/除数1(长)：");
            this.length = sc.nextDouble();
            System.out.print("请输入加/减/乘/除数2(宽)：");
            this.weight = sc.nextDouble();
            System.out.print("请输入加/减/乘/除数3(高)（立方算法需要，其他方法输入0.0即可）: ");
            this.high = sc.nextDouble();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
