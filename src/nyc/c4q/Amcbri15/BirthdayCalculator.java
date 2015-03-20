package nyc.c4q.Amcbri15;
import java.util.Scanner;
import java.util.Calendar;
/**
 * Created by c4q-anthony-mcbride on 3/19/15.
 */
public class BirthdayCalculator {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int month = 4;
        int day = 19;




        int currentDay = calendar.get(Calendar.DAY_OF_YEAR);
       calendar.set(2015,4,19);
        int birthday = calendar.get(Calendar.DAY_OF_YEAR);


        System.out.println(currentDay);
        System.out.println(birthday);


        System.out.println("PLease enter your birthday: " );
        System.out.println("What is the month (1-12): ");
        System.out.println("What is the day (1-31): ");



    }
    public static void set(int year, int month, int day) {
    }
}
