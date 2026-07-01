import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Birth Year : ");
        int year = sc.nextInt();

        System.out.print("Enter Birth Month : ");
        int month = sc.nextInt();

        System.out.print("Enter Birth Day : ");
        int day = sc.nextInt();

        LocalDateTime dob = LocalDateTime.of(year, month, day, 0, 0, 0);
        LocalDateTime now = LocalDateTime.now();

        long totalSeconds = Duration.between(dob, now).getSeconds();

        long years = totalSeconds / (365L * 24 * 60 * 60);
        totalSeconds %= (365L * 24 * 60 * 60);

        long months = totalSeconds / (30L * 24 * 60 * 60);
        totalSeconds %= (30L * 24 * 60 * 60);

        long weeks = totalSeconds / (7L * 24 * 60 * 60);
        totalSeconds %= (7L * 24 * 60 * 60);

        long days = totalSeconds / (24L * 60 * 60);
        totalSeconds %= (24L * 60 * 60);

        long hours = totalSeconds / (60L * 60);
        totalSeconds %= (60L * 60);

        long minutes = totalSeconds / 60;
        long seconds = totalSeconds % 60;

        System.out.println("\nYou are " +
                years + " Years, " +
                months + " Months, " +
                weeks + " Weeks, " +
                days + " Days, " +
                hours + " Hours, " +
                minutes + " Minutes and " +
                seconds + " Seconds old.");

        sc.close();
    }
}