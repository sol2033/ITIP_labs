import java.util.Scanner; 

public class SumNum{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.print(digitSum(a));        
    }

    public static int digitSum(int a){
        int sum = 0;
        while (a > 0) {
            sum += a % 10;
            a = a / 10;
        }
        return sum;
    }
}
