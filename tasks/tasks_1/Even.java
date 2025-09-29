import java.util.Scanner;

public class Even{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.print(isEven(a));
    }

    public static boolean isEven(int a){
        if (a % 2 == 0)
        return true;
        else 
        return false;
    }
}