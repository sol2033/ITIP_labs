import java.util.Scanner;

public class Seasons {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.print(season(a));
    }

    public static String season(int a){
        if (a == 1 || a == 2 || a == 12)
        return "зима";
        else if (a >= 3 && a <= 5)
        return "весна";
        else if (a >= 6 && a <= 8)
        return "лето";
        else 
        return "осень";
    }
}
