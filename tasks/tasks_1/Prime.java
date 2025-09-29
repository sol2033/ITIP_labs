import java.util.Scanner;

public class Prime {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.print(isPrime(a));
    }

    public static boolean isPrime(int a){
        int k = 0;
        for (int i = 1; i <= a;i++){
            if (a % i == 0)
            k++;
        }
        if (k == 2)
        return true;
        else 
        return false;
    }
}
