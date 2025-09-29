import java.util.Scanner;

public class Rectangle{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        System.out.println(area(a,b));
    }

    public static double area(double a, double b){
        return a * b;
    }
}
