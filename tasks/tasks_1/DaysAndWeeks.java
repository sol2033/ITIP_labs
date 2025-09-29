import java.util.Scanner;

public class DaysAndWeeks{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int days = in.nextInt();   
        System.out.print(daysToWeeks(days));
    }

    public static String daysToWeeks(int days){
        int weeks = days / 7;
        int remainDays = days % 7;
        
        String weekWord = "";
        String dayWord = "";

        if (weeks % 10 == 1)
        weekWord = " неделя и ";
        else if (weeks % 10 >= 2 && weeks % 10 <= 4)
        weekWord = " недели и ";
        else 
        weekWord = " недель и ";

        if (remainDays % 10 == 1)
        dayWord = " день";
        else if (remainDays % 10 >= 2 && remainDays % 10 <= 4)
        dayWord = " дня";
        else 
        dayWord = " дней";

        return weeks + weekWord + remainDays + dayWord;
    }
}

